package com.lihoo.jnshu.service;

import com.lihoo.jnshu.model.StudentListDO;
import com.lihoo.jnshu.model.StudentListDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface StudentListDOService {
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
