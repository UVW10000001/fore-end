package com.uvw.pbath;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 对前端进行暴露的一个接口文档
 */
@Configuration//表明当前类是一个spring的配置
@EnableSwagger2 //开启swagger2接口文档
public class SwaggerConfiguration {
	/**接口文档的描述信息*/
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("蓝鸥考勤系统")//标题
				.description("蓝鸥学生考勤系统-接口文档")//描述
				.contact(new Contact(//文档作者联系方式
						"段小威",
						"http://www.baidu.com",
						"785973094@qq.com"))
				.version("1.0")//文档版本
				.build();//创建文档				
	}
	
	/**指定接口文档所在包*/
	@Bean //表明当前方法的返回值是一个bean对象,将其注册到spring容器
	public Docket createRestDocket() {
		return new Docket(DocumentationType.SWAGGER_2)//文档类型
				.apiInfo(apiInfo())
				.select()//选择需要暴露的接口
				.apis(RequestHandlerSelectors.//指定接口所在包
					basePackage("com.uvw.pbath.controller"))
				.paths(PathSelectors.any())//接口过滤规则
				.build();
	}
}





