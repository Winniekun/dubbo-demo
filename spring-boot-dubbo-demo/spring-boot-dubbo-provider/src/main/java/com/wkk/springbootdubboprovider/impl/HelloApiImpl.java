package com.wkk.springbootdubboprovider.impl;

import com.wkk.springbootdubboapi.api.HelloApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author weikunkun
 * @since 2021/9/8
 */
@Component
@DubboService(version = "1.0.0")
public class HelloApiImpl implements HelloApi {
    Logger logger = LoggerFactory.getLogger(HelloApiImpl.class);

    @Override
    public String sengMsg(String msg) {
        logger.info("received msg : {}", msg);
        return "this is spring-boot with dubbo, msg = " + msg;
    }
}
