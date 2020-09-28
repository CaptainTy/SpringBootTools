package com.xxfw.monitor.repository;


import com.xxfw.monitor.entity.ServerHistoryEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ServerHistoryEntityMapper {

    int insertSelective(ServerHistoryEntity record);

    List<ServerHistoryEntity> getServerHistoryInfo(@Param("time")Date time);

    ServerHistoryEntity getPrevServerHistory();
}