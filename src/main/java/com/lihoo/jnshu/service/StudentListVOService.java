package com.lihoo.jnshu.service;

import com.lihoo.jnshu.model.StudentListVO;
import com.lihoo.jnshu.model.StudentListVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentListVOService {
    long countByExample(StudentListVOExample example);

    int deleteByExample(StudentListVOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentListVO record);

    int insertSelective(StudentListVO record);

    List<StudentListVO> selectByExample(StudentListVOExample example);

    StudentListVO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentListVO record, @Param("example") StudentListVOExample example);

    int updateByExample(@Param("record") StudentListVO record, @Param("example") StudentListVOExample example);

    int updateByPrimaryKeySelective(StudentListVO record);

    int updateByPrimaryKey(StudentListVO record);
}
