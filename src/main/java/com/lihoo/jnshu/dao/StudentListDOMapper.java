package com.lihoo.jnshu.dao;

import com.lihoo.jnshu.model.StudentListDO;
import com.lihoo.jnshu.model.StudentListDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StudentListDOMapper {
    long countByExample(StudentListDOExample example);

    int deleteByExample(StudentListDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentListDO record);

    int insertSelective(StudentListDO record);

    List<StudentListDO> selectByExample(StudentListDOExample example);

    StudentListDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentListDO record, @Param("example") StudentListDOExample example);

    int updateByExample(@Param("record") StudentListDO record, @Param("example") StudentListDOExample example);

    int updateByPrimaryKeySelective(StudentListDO record);

    int updateByPrimaryKey(StudentListDO record);
}