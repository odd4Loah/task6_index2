package com.lihoo.jnshu.service.impl;

import com.lihoo.jnshu.dao.StudentProfessionDOMapper;
import com.lihoo.jnshu.model.StudentProfessionDO;
import com.lihoo.jnshu.model.StudentProfessionDOExample;
import com.lihoo.jnshu.service.StudentProfessionDOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * #Title: StudentProfessionDOServiceImpl
 * #ProjectName task6_index2
 * #Description: TODO
 * #author lihoo
 * #date 2018/9/15-18:40
 */

@Service
public class StudentProfessionDOServiceImpl implements StudentProfessionDOService {

    @Autowired
    StudentProfessionDOMapper studentProfessionDOMapper;

    @Override
    public long countByExample(StudentProfessionDOExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(StudentProfessionDOExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(StudentProfessionDO record) {
        return 0;
    }

    @Override
    public int insertSelective(StudentProfessionDO record) {
        return 0;
    }

    @Override
    public List<StudentProfessionDO> selectByExample(StudentProfessionDOExample example) {
        return null;
    }

    @Override
    public StudentProfessionDO selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(StudentProfessionDO record, StudentProfessionDOExample example) {
        return 0;
    }

    @Override
    public int updateByExample(StudentProfessionDO record, StudentProfessionDOExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(StudentProfessionDO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StudentProfessionDO record) {
        return 0;
    }
}
