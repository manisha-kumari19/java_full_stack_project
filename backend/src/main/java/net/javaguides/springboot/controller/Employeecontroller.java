package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.FileEntity;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.services.FileService;


@RestController
@RequestMapping("api/v1/")
@CrossOrigin("*")
public class Employeecontroller {

	
//	private final FileService fileService;
	
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	
	
	
//	@Autowired
//	public Employeecontroller(FileService fileService) {
//          this.fileService = fileService;
//	}
//	
	//get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	
	//create employee rest api
	@PostMapping("/employees")
	public Employee creatEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	//get employee by id rest api
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		 
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
	    return  ResponseEntity.ok(employee);
	}
	
	
	//update employee rest api
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails){
		
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
	    		
		employee.setFirstname(employeeDetails.getFirstname());
		employee
		
		.setDesignation(employeeDetails.getDesignation());
		employee.setEmailid(employeeDetails.getEmailid());
		
		Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}
//	
//	@PostMapping("/upload")
//	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
//		try {
//			 // Convert the MultipartFile to a FileEntity object
//            FileEntity fileEntity = new FileEntity();
//            fileEntity.setFileName(file.getOriginalFilename());
//            fileEntity.setFileType(file.getContentType());
//            fileEntity.setData(file.getBytes());
//
//            // Save the FileEntity to the database using FileService
//            fileService.saveFile(fileEntity);
//
//            return ResponseEntity.ok("File uploaded successfully.");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file.");
//        }
//        }
//	
}














