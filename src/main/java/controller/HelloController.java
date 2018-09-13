package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class HelloController {

    @RequestMapping("/get")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        File file = new File("resource.spring-mvc.xml");
        System.out.println(file.exists());
    }
}
