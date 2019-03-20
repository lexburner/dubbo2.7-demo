package org.apache.dubbo.demo;

import org.apache.dubbo.common.Constants;
import org.apache.dubbo.demo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cvictory ON 2018/11/29
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public ModelAndView testDemo() {
        ModelAndView modelAndView = new ModelAndView("index");
        org.apache.dubbo.rpc.RpcContext.getContext().setAttachment(Constants.TAG_KEY, "gray");
        modelAndView.addObject("result", demoService.sayHello("Dubbo Meetup"));
        return modelAndView;
    }

    @RequestMapping("/error")
    public String error() {
        return "the error";
    }

}
