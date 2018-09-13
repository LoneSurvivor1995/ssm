package controller;

import entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import service.HelloService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping("/insert")
//    public String insert(@RequestBody User user){
    public String insert(){
        User user = new User();
        user.setSid(10);
        user.setSname("ten");
        user.setSage(10);
        user.setSsex("男");
        helloService.insert(user);
        return "insert success";
    }

    @RequestMapping("/delete")
//    public String delete(@RequestBody List<String> ids){
    public String delete(){
        List<String> ids = new ArrayList<>();
        ids.add("9");
        ids.add("10");
        helloService.delete(ids);
        return "delete success";
    }

    @RequestMapping("/update")
//    public String update(@RequestBody User user){
    public String update(){
        User user = new User();
        user.setSid(2);
        user.setSname("lqd");
        user.setSage(2);
        user.setSsex("男");
        helloService.update(user);
        return "update success";
    }

    @RequestMapping("/query")
//    public List<User> query(@RequestBody Map<String,Object> map){
    public List<User> query(){
        Map<String,Object> map = new HashMap<>();
        map.put("sid",1);
        List<User> users = helloService.query(map);
        System.out.println(users.get(0));
        return users;
    }

    @RequestMapping("/page")
    public ModelAndView page(){
        return new ModelAndView("one");
    }
}
