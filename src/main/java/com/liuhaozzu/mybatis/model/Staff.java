package com.liuhaozzu.mybatis.model;

import java.util.Date;

public class Staff {
    private Integer id;

    private String name;

    private String dept;

    private Integer salary;

    private Integer edlevel;

    private Date hiredate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getEdlevel() {
        return edlevel;
    }

    public void setEdlevel(Integer edlevel) {
        this.edlevel = edlevel;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}