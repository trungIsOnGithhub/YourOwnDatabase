
package com.trung.filemanager.repository;

import java.util.List;
// import com.trung.filemanager.entity.User;
import com.trung.filemanager.entity.GroupUser;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface GroupUserRepository extends CrudRepository<GroupUser, Long> {
    List<GroupUser> getByGroupId(Long id);
    List<GroupUser> getByEmail(String email);
    GroupUser getByEmailAndGroupId(String email, Long groupId);

    @Transactional
    @Modifying
    void deleteByGroupid(Long id);

    @Transactional
    @Modifying
    void deleteByGroupidAndEmail(Long groupId, String email);
}