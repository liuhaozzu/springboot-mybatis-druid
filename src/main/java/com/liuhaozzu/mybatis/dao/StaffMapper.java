package com.liuhaozzu.mybatis.dao;

import com.liuhaozzu.mybatis.model.Staff;

public interface StaffMapper {
    int insert(Staff record);

    int insertSelective(Staff record);
}