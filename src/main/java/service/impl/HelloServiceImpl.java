package service.impl;

import entity.User;
import mapper.HelloMapper;
import org.springframework.stereotype.Service;
import service.HelloService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    HelloMapper helloMapper;


    @Override
    public void insert(User user) {
        helloMapper.insert(user);
    }

    @Override
    public void delete(List<String> ids) {
        helloMapper.delete(ids);
    }

    @Override
    public void update(User user) {
        helloMapper.update(user);
    }

    @Override
    public List<User> query(Map<String, Object> map) {
        return helloMapper.query(map);
    }
}
