package com.dsk.controller;

import com.alibaba.fastjson.JSONObject;
import com.dsk.bean.DemoInfo;
import com.dsk.map.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试类.
 *
 * @author dsk(QQ:393573645)
 * @version v.0.1
 */
@Controller
public class RequestController {

    /**
     * 通过@PathVariabl获取路径中的参数(http://127.0.0.1:8080/user/1/dingshoukun)
     * @param id
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "user/{id}/{name}", method = RequestMethod.GET)
    public String printMessage1(@PathVariable String id, @PathVariable String name) {
        Map data = new HashMap();
        data.put("id",id);
        data.put("name",name);
        return JSONObject.toJSONString(data);
    }

    /**
     * @ModelAttribute获取POST请求的FORM表单数据(http://127.0.0.1:8080/modelattribute)[没有理解]
     * @param post
     * @return
     */
    @ResponseBody
    @RequestMapping(value="modelattribute",method = RequestMethod.POST)
    public String processSubmit(@ModelAttribute("post") Post post) {

        return JSONObject.toJSONString(post);
    }

    /**
     * 直接用HttpServletRequest获取get和post参数(curl http://127.0.0.1:8080/get\?get\=get --data "post=post")
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping
    public String get(HttpServletRequest request, HttpServletResponse response) {
        Map data = new HashMap();
        data.put("get",request.getParameter("get"));
        data.put("post",request.getParameter("post"));
        return JSONObject.toJSONString(data);
    }

    /**
     *用注解@RequestParam绑定请求参数
     * @param a
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/requestParam", method = RequestMethod.GET)
    public String setupForm(@RequestParam("a") String a) {
        return JSONObject.toJSONString(a);
    }
}
