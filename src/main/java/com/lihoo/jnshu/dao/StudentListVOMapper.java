package com.lihoo.jnshu.dao;

import com.lihoo.jnshu.model.StudentListVO;
import com.lihoo.jnshu.model.StudentListVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StudentListVOMapper {
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