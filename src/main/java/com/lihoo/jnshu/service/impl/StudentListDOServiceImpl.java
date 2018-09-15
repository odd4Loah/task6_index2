package com.lihoo.jnshu.service.impl;

import com.lihoo.jnshu.dao.StudentListDOMapper;
import com.lihoo.jnshu.model.StudentListDO;
import com.lihoo.jnshu.model.StudentListDOExample;
import com.lihoo.jnshu.service.StudentListDOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * #Title: StudentListDOServiceImpl
 * #ProjectName task6_index2
 * #Description: TODO
 * #author lihoo
 * #date 2018/9/15-9:33
 */

@Service
public class StudentListDOServiceImpl implements StudentListDOService {

    @Autowired
    StudentListDOMapper studentListDOMapper;

    @Override
    public long countByExample(StudentListDOExample example) {
        return studentListDOMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentListDOExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(StudentListDO record) {
        return 0;
    }

    @Override
    public int insertSelective(StudentListDO record) {
        return 0;
    }

    @Override
    public List<StudentListDO> selectByExample(StudentListDOExample example) {
        return null;
    }

    @Override
    public StudentListDO selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(StudentListDO record, StudentListDOExample example) {
        return 0;
    }

    @Override
    public int updateByExample(StudentListDO record, StudentListDOExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(StudentListDO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StudentListDO record) {
        return 0;
    }
}
