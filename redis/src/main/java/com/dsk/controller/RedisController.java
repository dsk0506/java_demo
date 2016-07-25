package com.dsk.controller;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.dsk.config.RedisAConfig;
import com.dsk.config.RedisBConfig;
import com.mysql.jdbc.log.Log;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试类.
 *
 * @author dsk(QQ:393573645)
 * @version v.0.1
 */
@Controller
public class RedisController {

    @Autowired
    private RedisAConfig redisAConfig;

    @Autowired
    private RedisBConfig redisBConfig;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/redis")
    @ResponseBody
    public String redis(){
        redisAConfig.redisTemplate().opsForValue().set("aaa","111222");
        return redisAConfig.redisTemplate().opsForValue().get("aaa");
        //return stringRedisTemplate.opsForValue().get("aaa");
    }


}