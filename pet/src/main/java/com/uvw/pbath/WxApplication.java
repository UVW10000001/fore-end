package com.uvw.pbath;
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