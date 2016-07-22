package com.dsk.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dsk on 16/7/22.
 */
@Controller
public class SeesionController {

    /**
     * 设置session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/setsession", method = RequestMethod.GET)
    public String setsession(HttpSession session) {
        session.setAttribute("name","dingding");
        return "ok";
    }

    /**
     * 获取session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getsession", method = RequestMethod.GET)
    public String session(HttpSession session) {
        String data = (String) session.getAttribute("name");
        return data;
    }
}
