package com.uvw.pbath.WxA;
import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
@SpringBootApplication
@MapperScan("com.uvw.pbath.mapper")
public class WxApplication {
	public static void main(String[] args) {
		SpringApplication.run(WxApplication.class, args);
	}
}
/*@Component
public class WxApplication implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
	// 这里可以添加一些其他逻辑，这里具体是实现了WxApplication	
		System.out.println("我启动了");
	}
}*/