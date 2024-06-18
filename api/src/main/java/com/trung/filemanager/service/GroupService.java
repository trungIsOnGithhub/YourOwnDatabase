package com.trung.filemanager.service;

import com.trung.filemanager.entity.File;
import com.trung.filemanager.entity.Ugroup;
import com.trung.filemanager.repository.FileRepository;
import com.trung.filemanager.repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository repository;

    public void addGroup(Ugroup group) {
        repository.save(group);
    }

    public List<Ugroup> getGroups(String email) {
        return repository.getGroupsByOwner(email);
    }

    public void deleteGroup(Long id) {
        repository.deleteById(id);
    }

    public Ugroup getGroupByGroupId(Long id) {
        return repository.getById(id);
    }

    public Ugroup deleteGroupByGroupId(Long id) {
        return repository.getById(id);
    }
}