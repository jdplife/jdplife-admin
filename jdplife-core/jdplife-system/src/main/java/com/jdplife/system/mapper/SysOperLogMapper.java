package com.jdplife.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jdplife.system.entity.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志Mapper
 */
@Mapper
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {
}
