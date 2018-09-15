package com.lihoo.jnshu.service.impl;

import com.lihoo.jnshu.dao.StudentListVOMapper;
import com.lihoo.jnshu.model.StudentListVO;
import com.lihoo.jnshu.model.StudentListVOExample;
import com.lihoo.jnshu.service.StudentListVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * #Title: StudentListVOServiceImpl
 * #ProjectName task6_index2
 * #Description: TODO
 * #author lihoo
 * #date 2018/9/15-9:33
 */

@Service
public class StudentListVOServiceImpl implements StudentListVOService {

    @Autowired
    StudentListVOMapper studentListVOMapper;

    @Override
    public long countByExample(StudentListVOExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(StudentListVOExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(StudentListVO record) {
        return 0;
    }

    @Override
    public int insertSelective(StudentListVO record) {
        return 0;
    }

    @Override
    public List<StudentListVO> selectByExample(StudentListVOExample example) {
        return null;
    }

    @Override
    public StudentListVO selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(StudentListVO record, StudentListVOExample example) {
        return 0;
    }

    @Override
    public int updateByExample(StudentListVO record, StudentListVOExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(StudentListVO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StudentListVO record) {
        return 0;
    }
}
