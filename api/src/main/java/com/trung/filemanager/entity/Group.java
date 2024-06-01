package com.trung.filemanager.entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Groups {
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

    public Integer getGroupId() {
        return id;
    }

    public void setGroupId(Integer id) {
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