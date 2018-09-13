package service.impl;

import mapper.HelloMapper;
import org.springframework.stereotype.Service;
import service.HelloService;

import javax.annotation.Resource;

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    HelloMapper helloMapper;

    @Override
    public String get() {
        System.out.println(helloMapper.get().get(0));
        return "success";
    }
}
