
package com.trung.filemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.trung.filemanager.entity.File;
import com.trung.filemanager.entity.Ugroup;

public interface GroupRepository extends CrudRepository<Ugroup, Long> {
    List<Ugroup> getGroupsByOwner(String email);
    Ugroup getById(Long id);

    @Transactional
    @Modifying
    void deleteById(Long id);
}