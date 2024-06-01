package com.trung.filemanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupUsers {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    Long groupId;

    String email;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupid;
    }
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}