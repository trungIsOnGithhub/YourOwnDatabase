package com.trung.filemanager.service;

import com.trung.filemanager.entity.File;
import com.trung.filemanager.entity.Group;
import com.trung.filemanager.repository.FileRepository;
import com.trung.filemanager.repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository repository;

    public void addGroup(Group group) {
        repository.save(group);
    }

    public List<Group> getGroups(String email) {
        return repository.getGroupsByOwner(email);
    }

    public void deleteGroup(Integer id) {
        repository.deleteByGroupid(id);
    }

    public Group getGroupByGroupId(Integer id) {
        return repository.getByGroupid(id);
    }
}