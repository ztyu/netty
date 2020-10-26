package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=YiyuApplication.class)
public class YiyuApplicationTests {

/*
	public static void main(String[] args) {
		SpringApplication.run(YiyuApplication.class, args);
	}*/


	@Test
	public void test(){
		User user = new User();
		System.out.println(user);
		user.start();
	}
}
