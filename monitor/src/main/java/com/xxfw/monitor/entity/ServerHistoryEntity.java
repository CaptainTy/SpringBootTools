package com.xxfw.monitor.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ServerHistoryEntity {
    private Integer id;

    private Date time;

    private Long in_msgs;

    private Long out_msgs;

    private Long in_bytes;

    private Long out_bytes;

    private Long in_msgs_speed;

    private Long out_msgs_speed;

    private Long in_bytes_speed;

    private Long out_bytes_speed;

    private Long connections;

    private Long slow_consumers;

    private Long subscriptions;

}