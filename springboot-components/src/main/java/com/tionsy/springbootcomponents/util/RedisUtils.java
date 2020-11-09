package com.tionsy.springbootcomponents.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

/**
 * redis操作工具类
 * @author: tiany
 */
@Slf4j
@Component
public final class RedisUtils {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 设置kv
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    /**
     * 设置kv和时间
     * @param key
     * @param value
     * @param time 秒
     */
    public void set(String key, String value,Long time) {
        redisTemplate.opsForValue().set(key,value,time,TimeUnit.SECONDS);
    }

    public Long set(String key,String[] values){
        return redisTemplate.opsForSet().add(key,values);
    }

    /**
     * 非原子事务
     * @param key
     * @param values
     * @param time  秒
     * @return
     */
    public Long set(String key,String[] values,Long time){
        Long count =  redisTemplate.opsForSet().add(key,values);
        redisTemplate.expire(key,time, TimeUnit.SECONDS);
        return count;
    }


    public Boolean setNXDataIgnore(String key, String value,Long timeout){
        return redisTemplate.opsForValue().setIfAbsent(key, value, timeout, TimeUnit.SECONDS);
    }

    public String getVal(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public Boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    public Boolean isMember(String key,String value){
        return redisTemplate.opsForSet().isMember(key,value);
    }

    public Boolean del(String key){
        return redisTemplate.delete(key);
    }

    /**
     * 删除数据，失败会重试
     * @param key
     * @param retryTime 可变参数，默认重试3次
     * @return
     */
    public boolean deleteDataWithRetry(String key, int... retryTime) {
        // 默认重试3次
        int retryTimeTmp = (retryTime != null && retryTime.length > 0 && retryTime[0] > 0) ? retryTime[0] : 5;

        for (int i = 0; i < retryTimeTmp; i++) {
            if (del(key)) {
                log.info("删除成功");
                break;
            }
        }
        return true;
    }


    public String getKey(String... keys) {
        StringJoiner joiner = new StringJoiner("_");
        for (String k : keys) {
            joiner.add(k);
        }
        return joiner.toString();
    }


}
