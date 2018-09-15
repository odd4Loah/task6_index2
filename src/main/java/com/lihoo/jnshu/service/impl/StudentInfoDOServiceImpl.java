package com.lihoo.jnshu.service.impl;

import com.lihoo.jnshu.dao.StudentInfoDOMapper;
import com.lihoo.jnshu.model.StudentInfoDO;
import com.lihoo.jnshu.model.StudentInfoDOExample;
import com.lihoo.jnshu.service.StudentInfoDOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * #Title: StudentInfoDOServiceImpl
 * #ProjectName task6_index2
 * #Description: TODO
 * #author lihoo
 * #date 2018/9/15-11:16
 */

@Service
public class StudentInfoDOServiceImpl implements StudentInfoDOService {

    @Autowired
    StudentInfoDOMapper studentInfoDOMapper;

    @Override
    public long countByExample(StudentInfoDOExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(StudentInfoDOExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(StudentInfoDO record) {
        return 0;
    }

    @Override
    public int insertSelective(StudentInfoDO record) {
        return 0;
    }

    @Override
    public List<StudentInfoDO> selectByExample(StudentInfoDOExample example) {
        studentInfoDOMapper.selectByExample(example);

        return null;
    }

    @Override
    public StudentInfoDO selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(StudentInfoDO record, StudentInfoDOExample example) {
        return 0;
    }

    @Override
    public int updateByExample(StudentInfoDO record, StudentInfoDOExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(StudentInfoDO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StudentInfoDO record) {
        return 0;
    }
}
