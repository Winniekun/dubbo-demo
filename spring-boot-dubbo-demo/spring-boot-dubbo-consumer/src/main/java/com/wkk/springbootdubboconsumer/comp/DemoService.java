package com.wkk.springbootdubboconsumer.comp;

import com.wkk.springbootdubboapi.api.HelloApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author weikunkun
 * @since 2021/9/8
 */
@Component
public class DemoService implements HelloApi {
    @DubboReference(version = "1.0.0", url = "dubbo://192.168.1.19:20880")
    private HelloApi helloApi;

    @Override
    public String sengMsg(String msg) {
        return helloApi.sengMsg(msg);
    }

}
