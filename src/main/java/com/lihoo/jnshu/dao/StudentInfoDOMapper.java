package com.lihoo.jnshu.dao;

import com.lihoo.jnshu.model.StudentInfoDO;
import com.lihoo.jnshu.model.StudentInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StudentInfoDOMapper {
    long countByExample(StudentInfoDOExample example);

    int deleteByExample(StudentInfoDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentInfoDO record);

    int insertSelective(StudentInfoDO record);

    List<StudentInfoDO> selectByExample(StudentInfoDOExample example);

    StudentInfoDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentInfoDO record, @Param("example") StudentInfoDOExample example);

    int updateByExample(@Param("record") StudentInfoDO record, @Param("example") StudentInfoDOExample example);

    int updateByPrimaryKeySelective(StudentInfoDO record);

    int updateByPrimaryKey(StudentInfoDO record);
}