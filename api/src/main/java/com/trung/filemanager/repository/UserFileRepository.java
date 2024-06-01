
package com.trung.filemanager.repository;

import com.trung.filemanager.entity.UserFile;
import com.trung.filemanager.entity.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserFileRepository extends CrudRepository<UserFile, Long> {
    List<UserFile> getByEmail(String email);

    @Transactional
    @Modifying
    void deleteByFilepath(String filepath);

    @Transactional
    @Modifying
    void deleteByFilepathAndEmail(String filepath, String email);
}