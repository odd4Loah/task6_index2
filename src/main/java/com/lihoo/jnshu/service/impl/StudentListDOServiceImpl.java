package com.lihoo.jnshu.service.impl;

import com.lihoo.jnshu.dao.StudentListDOMapper;
import com.lihoo.jnshu.model.StudentListDO;
import com.lihoo.jnshu.model.StudentListDOExample;
import com.lihoo.jnshu.service.StudentListDOService;
import com.lihoo.jnshu.util.Log2Util;
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
        return studentListDOMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentListDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentListDO record) {
        int newStu = studentListDOMapper.insert(record);
        Log2Util.logger.info("----");
        return newStu;
    }

    @Override
    public int insertSelective(StudentListDO record) {
        return studentListDOMapper.insertSelective(record);
    }

    @Override
    public List<StudentListDO> selectByExample(StudentListDOExample example) {
        return studentListDOMapper.selectByExample(example);
    }

    @Override
    public StudentListDO selectByPrimaryKey(Long id) {
        return studentListDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(StudentListDO record, StudentListDOExample example) {
        return studentListDOMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(StudentListDO record, StudentListDOExample example) {
        return studentListDOMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentListDO record) {
        return studentListDOMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentListDO record) {
        return studentListDOMapper.updateByPrimaryKey(record);
    }
}
