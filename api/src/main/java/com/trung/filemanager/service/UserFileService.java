package com.trung.filemanager.service;

import com.trung.filemanager.entity.UserFile;
import com.trung.filemanager.repository.UserFileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFileService {
    @Autowired
    private UserFileRepository repository;

    public void addUserFile(UserFile record) {
        repository.save(record);
    }

    public List<UserFile> getUserFilesByEmail(String email) {
       return repository.getByEmail(email);
    }

    public void deleteUserFilesByFilepath(String filepath) {
        repository.deleteByFilepath(filepath);
    }
}