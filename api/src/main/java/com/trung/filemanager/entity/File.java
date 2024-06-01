package com.trung.filemanager.entity;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Files {
    @Id
    String filepath;

    String filename;

    String fileparent;

    String isfile;

    boolean starred;

    String owner;

    Integer sharedcount;

    public Integer getSharedcount() {
        return sharedcount;
    }

    public void setSharedcount(Integer sharedcount) {
        this.sharedcount = sharedcount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }
    public boolean getStarred() {
        return starred;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFileparent() {
        return fileparent;
    }

    public void setFileparent(String fileparent) {
        this.fileparent = fileparent;
    }

    public String getIsfile() {
        return isfile;
    }

    public void setIsfile(String isfile) {
        this.isfile = isfile;
    }
}