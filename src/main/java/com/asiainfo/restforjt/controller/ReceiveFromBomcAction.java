package com.asiainfo.restforjt.controller;

import com.asiainfo.restforjt.service.ReceiveFromBomcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReceiveFromBomcAction extends BaseController{


    @Autowired
    private ReceiveFromBomcService bomcService;
}
