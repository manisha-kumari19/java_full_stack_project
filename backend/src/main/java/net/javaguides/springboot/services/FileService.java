package net.javaguides.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.springboot.model.FileEntity;
import net.javaguides.springboot.repository.FileEntityRepository;

public class FileService {
	
	private final FileEntityRepository fileEntityRepository;

    @Autowired
    public FileService(FileEntityRepository fileEntityRepository) {
        this.fileEntityRepository = fileEntityRepository;
    }

    public FileEntity saveFile(FileEntity fileEntity) {
        return fileEntityRepository.save(fileEntity);
    }

}
