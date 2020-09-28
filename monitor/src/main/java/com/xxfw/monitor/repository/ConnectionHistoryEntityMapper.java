package com.xxfw.monitor.repository;

import com.xxfw.monitor.entity.ConnectionHistoryEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ConnectionHistoryEntityMapper {

    int insertSelective(ConnectionHistoryEntity record);

    List<ConnectionHistoryEntity> getConnectionHistory(@Param("cid")long cid, @Param("time")Date time);

    ConnectionHistoryEntity getPrevConnectionHistory(@Param("cid")long cid);
}