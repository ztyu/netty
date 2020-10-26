package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
//@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurationSupport {

    @Value("${spring.servlet.multipart.location}")
    private String storageRootFolder;

    @Value("${spring.servlet.asset.virtual.path}")
    String virtualPath;

    /***
     * 配置图片等资源虚拟路径
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(virtualPath).addResourceLocations("file:" + storageRootFolder);
    }


}
