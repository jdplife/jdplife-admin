package com.jdplife.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdplife.biz.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生表 Mapper
 * 
 * @author jdplife
 * @date 2026-03-01
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
