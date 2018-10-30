package com.project.dao;

import com.project.pojo.Projects;

public interface ProjectsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Projects record);

    int insertSelective(Projects record);

    Projects selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Projects record);

    int updateByPrimaryKey(Projects record);
}