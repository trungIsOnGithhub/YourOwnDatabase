
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
    List<UserFile> getByFileparent(String filepath);
    UserFile getByFilepathAndFileparent(String filepath, String fileparent);

    @Transactional
    @Modifying
    void deleteByFilepath(String filepath);

    @Transactional
    @Modifying
    @Query("UPDATE File SET File.starred = :starred WHERE File.filepath = :filepath")
    void markStar(@Param("filepath") String filepath, @Param("starred") String starred);

    @Transactional
    @Modifying
    @Query("UPDATE File SET File.sharedcount = :sharedcount WHERE File.filepath = :filepath")
    void updateSharedCount(@Param("filepath") String filepath, @Param("sharedcount") Integer sharedcount);
}