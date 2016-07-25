package com.dsk.controller;

import com.alibaba.fastjson.JSONObject;
import com.dsk.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试类.
 *
 * @author dsk(QQ:393573645)
 * @version v.0.1
 */
@Controller
public class RedisController {

    @Autowired
    private RedisConfig redisAConfig;

    @RequestMapping("/redis")
    @ResponseBody
    public String redis(){
        redisAConfig.redisTemplate().opsForValue().set("aaa","111222");
        String value2 = redisAConfig.redisTemplate().opsForValue().get("aaa");;
        Map data = new HashMap();
        data.put("2",value2);
        return JSONObject.toJSONString(data);

    }


}