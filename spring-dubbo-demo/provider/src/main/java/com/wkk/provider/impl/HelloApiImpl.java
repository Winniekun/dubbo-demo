package com.wkk.provider.impl;

import com.wkk.api.HelloApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author weikunkun
 * @since 2021/9/7
 */
public class HelloApiImpl implements HelloApi {
    Logger logger = LoggerFactory.getLogger(HelloApiImpl.class);

    @Override
    public String sendMsg(String msg) {
        logger.info("receive msg : {}", msg);
        return "this is quick start demo about dubbo, msg = " + msg;
    }
}
