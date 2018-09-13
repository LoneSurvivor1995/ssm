package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import service.HelloService;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping("/get")
    public String get(){
        return helloService.get();
    }

    @RequestMapping("/find")
    public String find(){
        return "find";
    }

    @RequestMapping("/page")
    public ModelAndView page(){
        return new ModelAndView("one");
    }
}
