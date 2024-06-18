package com.trung.filemanager.service;

import com.trung.filemanager.entity.User;
import com.trung.filemanager.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> login(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);
    }

    public void updateLastLogin(String email) {
        userRepository.updateLastLogin(email);
    }

    public User getUserDetails(String email) {
        return userRepository.findByEmail(email);
    }

    // public int updateUserDetails(User user) {
    //     return userRepository.updateUserDetails(user.getFirstname(), user.getLastname(),
    //                                         user.getContact(), user.getMotto(),
    //                                         user.getEmail());
    // }
}