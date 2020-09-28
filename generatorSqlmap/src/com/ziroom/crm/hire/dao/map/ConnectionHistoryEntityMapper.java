package com.ziroom.crm.hire.dao.map;

import com.ziroom.crm.hire.entity.ConnectionHistoryEntity;

public interface ConnectionHistoryEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ConnectionHistoryEntity record);

    int insertSelective(ConnectionHistoryEntity record);

    ConnectionHistoryEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConnectionHistoryEntity record);

    int updateByPrimaryKey(ConnectionHistoryEntity record);
}