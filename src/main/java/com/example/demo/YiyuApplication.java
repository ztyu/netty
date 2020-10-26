package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class YiyuApplication  {

	public static void main(String[] args) {
		SpringApplication.run(YiyuApplication.class, args);
	}

	@Component
	static class MyBeanPostProcessor1 implements BeanPostProcessor {
		@Override
		@Nullable
		public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("bean 初始化之前");
			return bean;
		}

		@Override
		@Nullable
		public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("bean 初始化之后");
			return bean;
		}
	}

	@Component
	static class MyBeanPostProcessor2 implements InstantiationAwareBeanPostProcessor {
		@Override
		@Nullable
		public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("bean 初始化之前2");
			return bean;
		}

		@Override
		@Nullable
		public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("bean 初始化之后2");
			return bean;
		}

		@Override
		@Nullable
		public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
			System.out.println("bean 实例化之前2");
			return null;
		}

		@Override
		public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
			System.out.println("bean 实例化之后2");
			return true;
		}

		@Override
		@Nullable
		public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
				throws BeansException {
			System.out.println(beanName+"----------------");
			System.out.println("bean 变量处理");
			return null;
		}
	}
}
