package com.ziroom.crm.hire.entity;

import java.util.Date;

public class ConnectionHistoryEntity {
    private Long id;

    private Date time;

    private Long inMsgs;

    private Long outMsgs;

    private Long inBytes;

    private Long outBytes;

    private Long inMsgsSpeed;

    private Long outMsgsSpeed;

    private Long inBytesSpeed;

    private Long outBytesSpeed;

    private Long subscriptions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getInMsgs() {
        return inMsgs;
    }

    public void setInMsgs(Long inMsgs) {
        this.inMsgs = inMsgs;
    }

    public Long getOutMsgs() {
        return outMsgs;
    }

    public void setOutMsgs(Long outMsgs) {
        this.outMsgs = outMsgs;
    }

    public Long getInBytes() {
        return inBytes;
    }

    public void setInBytes(Long inBytes) {
        this.inBytes = inBytes;
    }

    public Long getOutBytes() {
        return outBytes;
    }

    public void setOutBytes(Long outBytes) {
        this.outBytes = outBytes;
    }

    public Long getInMsgsSpeed() {
        return inMsgsSpeed;
    }

    public void setInMsgsSpeed(Long inMsgsSpeed) {
        this.inMsgsSpeed = inMsgsSpeed;
    }

    public Long getOutMsgsSpeed() {
        return outMsgsSpeed;
    }

    public void setOutMsgsSpeed(Long outMsgsSpeed) {
        this.outMsgsSpeed = outMsgsSpeed;
    }

    public Long getInBytesSpeed() {
        return inBytesSpeed;
    }

    public void setInBytesSpeed(Long inBytesSpeed) {
        this.inBytesSpeed = inBytesSpeed;
    }

    public Long getOutBytesSpeed() {
        return outBytesSpeed;
    }

    public void setOutBytesSpeed(Long outBytesSpeed) {
        this.outBytesSpeed = outBytesSpeed;
    }

    public Long getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Long subscriptions) {
        this.subscriptions = subscriptions;
    }
}