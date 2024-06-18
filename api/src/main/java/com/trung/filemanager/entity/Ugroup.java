package com.trung.filemanager.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Ugroup {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    String groupname;

    Integer membercount;

    String owner;

    public String getGroupname() {
        return groupname;
    }
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Long getGroupId() {
        return id;
    }

    public void setGroupId(Long id) {
        this.id = id;
    }

    public Integer getMembercount() {
        return membercount;
    }

    public void setMembercount(Integer membercount) {
        this.membercount = membercount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}