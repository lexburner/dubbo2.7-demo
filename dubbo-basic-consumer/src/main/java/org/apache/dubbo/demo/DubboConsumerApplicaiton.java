package org.apache.dubbo.demo;

import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.demo.api.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("spring/dubbo-consumer.xml")
public class DubboConsumerApplicaiton {

    public static final Logger logger = LoggerFactory.getLogger(DubboConsumerApplicaiton.class);

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplicaiton.class, args);
    }
}
