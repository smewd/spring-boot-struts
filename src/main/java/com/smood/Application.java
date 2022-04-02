package com.smood;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan(basePackageClasses = {
		com.smood.servlet.PackageMarker.class,
})
@ComponentScan(basePackageClasses = {
		com.smood.service.PackageMarker.class,
		com.smood.struts.PackageMarker.class,
})
public class Application extends SpringBootServletInitializer
{
	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(Application.class, args);
	}
}