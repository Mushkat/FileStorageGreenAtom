package com.test.filestoragegreen.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.filestoragegreen.model.FileEntity;

/*
* Интерфейс для доступа к crud методам.
 */
@Repository
public interface FileRepository extends JpaRepository<FileEntity, String> {
}