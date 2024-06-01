
package com.trung.filemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.trung.filemanager.entity.Files;
import com.trung.filemanager.entity.Groups;

public interface GroupRepository extends CrudRepository<Groups, Long> {
    List<Groups> getGroupsByOwner(String email);
    Groups getById(Integer id);

    @Transactional
    @Modifying
    void deleteById(Integer id);
}