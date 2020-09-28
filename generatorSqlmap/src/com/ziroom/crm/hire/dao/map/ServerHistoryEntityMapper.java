package com.ziroom.crm.hire.dao.map;

import com.ziroom.crm.hire.entity.ServerHistoryEntity;

public interface ServerHistoryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServerHistoryEntity record);

    int insertSelective(ServerHistoryEntity record);

    ServerHistoryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServerHistoryEntity record);

    int updateByPrimaryKey(ServerHistoryEntity record);
}