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
 * @author lihoo
 */

@Service
public class StudentInfoDOServiceImpl implements StudentInfoDOService {

    @Autowired
    StudentInfoDOMapper studentInfoDOMapper;

    @Override
    public long countByExample(StudentInfoDOExample example) {
        return studentInfoDOMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentInfoDOExample example) {
        return studentInfoDOMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentInfoDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentInfoDO record) {
        return studentInfoDOMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentInfoDO record) {
        return studentInfoDOMapper.insertSelective(record);
    }

    @Override
    public List<StudentInfoDO> selectByExample(StudentInfoDOExample example) {
        StudentInfoDOExample doExample = new StudentInfoDOExample();
        return studentInfoDOMapper.selectByExample(doExample);
    }

    @Override
    public StudentInfoDO selectByPrimaryKey(Long id) {
        return studentInfoDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(StudentInfoDO record, StudentInfoDOExample example) {
        return studentInfoDOMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(StudentInfoDO record, StudentInfoDOExample example) {
        return studentInfoDOMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentInfoDO record) {
        return studentInfoDOMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentInfoDO record) {
        return studentInfoDOMapper.updateByPrimaryKey(record);
    }
}
