package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController  {

    @GetMapping("/getPicture")
    public String getPicture() {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("url", "http://192.168.116.58:8080/asset/289.jpg");
        jsonArray.add(jsonObject);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("url", "http://192.168.116.58:8080/asset/289.jpg");
        jsonArray.add(jsonObject2);
        System.out.println(JSON.toJSONString(jsonArray));
        return JSON.toJSONString(jsonArray);
    }


}
