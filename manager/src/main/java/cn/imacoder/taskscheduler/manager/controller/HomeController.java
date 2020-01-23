package cn.imacoder.taskscheduler.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project:spring-taskscheduler
 * @Package:cn.imacoder.taskscheduler.manager.controller
 * @Created By: QIUYANJUN
 * @Date:2020/1/14 14:28
 * @Modify By: QIUYANJUN
 * @author:QIUYANJUN
 */

@RestController
@RequestMapping("/home")
public class HomeController extends BaseController {

    @RequestMapping("")
    public String Index() {
        this.logger.info("Home/Index");
        return "Home Index!!!";
    }
}
