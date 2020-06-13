package com.duia.entity;

import java.util.Date;

public class Course {
    private Integer id;

    private Integer directionid;

    private Integer classfyid;

    private Date raleasetime;

    private Integer sellcount;

    private String coursecover;

    private String validday;

    private Integer lecturerid;

    private String describe;

    private String free;

    private Long price;

    private Integer classid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDirectionid() {
        return directionid;
    }

    public void setDirectionid(Integer directionid) {
        this.directionid = directionid;
    }

    public Integer getClassfyid() {
        return classfyid;
    }

    public void setClassfyid(Integer classfyid) {
        this.classfyid = classfyid;
    }

    public Date getRaleasetime() {
        return raleasetime;
    }

    public void setRaleasetime(Date raleasetime) {
        this.raleasetime = raleasetime;
    }

    public Integer getSellcount() {
        return sellcount;
    }

    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    public String getCoursecover() {
        return coursecover;
    }

    public void setCoursecover(String coursecover) {
        this.coursecover = coursecover == null ? null : coursecover.trim();
    }

    public String getValidday() {
        return validday;
    }

    public void setValidday(String validday) {
        this.validday = validday == null ? null : validday.trim();
    }

    public Integer getLecturerid() {
        return lecturerid;
    }

    public void setLecturerid(Integer lecturerid) {
        this.lecturerid = lecturerid;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}