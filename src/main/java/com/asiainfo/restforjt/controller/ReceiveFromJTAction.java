package com.asiainfo.restforjt.controller;

import com.asiainfo.restforjt.service.ReceiveFromJTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SuppressWarnings("unused")
public class ReceiveFromJTAction extends BaseController{


    @Autowired
    private ReceiveFromJTService jtService;

    @ResponseBody
    @RequestMapping(value = "/saveTicket")
    public Map<String, Object> saveTicket(){


        Map<String, Object> map = new HashMap<>();
        map.put("resultcode","R000");
        map.put("resultmsg","R000");
        return map;

    }

}
