package com.trung.filemanager.repository;

import com.trung.filemanager.entity.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Long> {
    List<Users> findByEmailAndPassword(String email, String password);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET User.lastlogin = CURRENT_TIMESTAMP WHERE User.email = :email")
    void updateLastLogin(@Param("email") String email);

    Users findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET User.firstname = :firstname, User.lastname=:lastname, User.contact=:contact, User.motto=:motto WHERE User.email=:email")
    int updateUserDetails(@Param("firstname") String firstname, @Param("lastname") String lastname,
                           @Param("contact") String contact, @Param("motto") String motto,
                           @Param("email") String email);

}