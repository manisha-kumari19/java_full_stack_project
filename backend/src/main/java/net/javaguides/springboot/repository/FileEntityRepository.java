package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.FileEntity;

public interface FileEntityRepository extends JpaRepository<FileEntity, Long> {
	    // Additional methods, if required
	}


