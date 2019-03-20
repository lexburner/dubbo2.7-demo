package org.apache.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ImportResource("spring/dubbo-provider.xml")
public class DubboProviderApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DubboProviderApplication.class, args);
		new CountDownLatch(1).await();
	}
}
