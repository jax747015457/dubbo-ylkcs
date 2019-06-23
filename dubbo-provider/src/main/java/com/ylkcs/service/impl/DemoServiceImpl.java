package com.ylkcs.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ylkcs.service.DemoService;

import java.util.logging.Logger;

/**
 * DemoServiceImpl
 * 服务提供类
 * @author xiaoze
 * @date 2018/6/7
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    //分支标记
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
