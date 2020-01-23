package cn.imacoder.taskscheduler.task.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project:spring-taskscheduler
 * @Package:cn.imacoder.taskscheduler.task.controller
 * @Created By: QIUYANJUN
 * @Date:2020/1/22 14:47
 * @Modify By: QIUYANJUN
 * @author:QIUYANJUN
 */

@EnableAutoConfiguration
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public String Index() {
        return " job executor running.";
    }

}
