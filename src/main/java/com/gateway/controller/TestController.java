package com.gateway.controller;

import com.gateway.Exception.GatewayException;
import com.gateway.service.TestService;
import com.gateway.util.CommonUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by zengtao on 2016/3/23.
 */

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String uploadAreaReply(@RequestParam(value = "name") String name) throws GatewayException {
        System.out.println(name);
        //List<Map<String, Object>>  results =  testService.findAll();
        return CommonUtility.constructResultJson("0000", name);     //ss
    }


}
