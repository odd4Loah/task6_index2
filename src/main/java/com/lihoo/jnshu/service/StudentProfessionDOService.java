package com.lihoo.jnshu.service;

import com.lihoo.jnshu.model.StudentProfessionDO;
import com.lihoo.jnshu.model.StudentProfessionDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentProfessionDOService {
    long countByExample(StudentProfessionDOExample example);

    int deleteByExample(StudentProfessionDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentProfessionDO record);

    int insertSelective(StudentProfessionDO record);

    List<StudentProfessionDO> selectByExample(StudentProfessionDOExample example);

    StudentProfessionDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentProfessionDO record, @Param("example") StudentProfessionDOExample example);

    int updateByExample(@Param("record") StudentProfessionDO record, @Param("example") StudentProfessionDOExample example);

    int updateByPrimaryKeySelective(StudentProfessionDO record);

    int updateByPrimaryKey(StudentProfessionDO record);
}
