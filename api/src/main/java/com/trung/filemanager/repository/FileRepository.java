
package com.trung.filemanager.repository;

import com.trung.filemanager.entity.File;
import com.trung.filemanager.entity.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FileRepository extends CrudRepository<Files, Long> {
    List<Files> getByFileparent(String filepath);
    Files getByFilepathAndFileparent(String filepath, String fileparent);

    @Transactional
    @Modifying
    void deleteByFilepath(String filepath);

    @Transactional
    @Modifying
    @Query("UPDATE Files SET Files.starred = :starred WHERE Files.filepath = :filepath")
    void markStar(@Param("filepath") String filepath, @Param("starred") String starred);

    @Transactional
    @Modifying
    @Query("UPDATE Files SET Files.sharedcount = :sharedcount WHERE Files.filepath = :filepath")
    void updateSharedCount(@Param("filepath") String filepath, @Param("sharedcount") Integer sharedcount );
}