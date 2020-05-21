package cn.wbnull.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 登录接口
 *
 * @author dukunbiao(null)  2018-09-23
 * https://github.com/dkbnull/SpringBootDemo
 */
@RestController
@Scope("prototype")
public class LoginController extends BaseController {

    @PostMapping(value = "/login")
    public Object login(
            @RequestParam(value = "sign") String sign,
            @RequestParam(value = "timestamp") String timestamp,
            @RequestParam(value = "data") String data
    ) throws Exception {
        System.out.println(1321);
       // return baseService.login(data);
        HashMap<String,Object> map=new HashMap<>();
        map.put("1","31231");
        map.put("2","31231");
        return map;
    }

    @PostMapping(value = "/test")
    public Object test(

    ) throws Exception {
        System.out.println(1321);
        // return baseService.login(data);
        HashMap<String,Object> map=new HashMap<>();
        map.put("1","31231");
        map.put("2","31231");
        return map;
    }
}
