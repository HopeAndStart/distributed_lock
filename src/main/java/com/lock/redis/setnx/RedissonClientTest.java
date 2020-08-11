package com.lock.redis.setnx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Redisson客户端测试类
 *
 * @author zsl
 * @version 1.0.0
 * @date: 2020/8/11 16:04
 **/
@RestController
public class RedissonClientTest {

    @GetMapping(value = "/redisson/lock")
    public String redissonLock(){
      return "";
    }

}
