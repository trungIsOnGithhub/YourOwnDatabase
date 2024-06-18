package com.trung.filemanager.repository;

import com.trung.filemanager.entity.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByEmailAndPassword(String email, String password);

    @Transactional
    @Modifying
    @Query(value="UPDATE user SET user.lastlogin = CURRENT_TIMESTAMP WHERE user.email = :email", nativeQuery=true)
    void updateLastLogin(@Param("email") String email);

    User findByEmail(String email);

        // @Transactional
        // @Modifying
        // // @Query("UPDATE User SET User.firstname = :firstname, User.lastname=:lastname, User.contact=:contact, User.motto=:motto WHERE User.email=:email")
        // @Query("UPDATE User SET User.lastlogin = CURRENT_TIMESTAMP WHERE User.email = :email")
        // int updateUserDetails(@Param("firstname") String firstname, @Param("lastname") String lastname,
        //                        @Param("contact") String contact, @Param("motto") String motto,
        //                        @Param("email") String email);
}