package service.impl;

import org.springframework.stereotype.Service;
import service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String get() {
        return "HelloServiceImpl get ...";
    }
}
