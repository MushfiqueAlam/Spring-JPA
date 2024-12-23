package com.jpaexample.jpa;

import com.jpaexample.jpa.dao.UserReposetory;
import com.jpaexample.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(JpaApplication.class, args);
//		System.out.println("This project with jpa");
		UserReposetory userReposetory=context.getBean(UserReposetory.class);
		User user=new User();
		user.setName("Mushfique Alam");
		user.setCity("Hyderabad");
		user.setStatus("He is a Java Developer");
		User user1=userReposetory.save(user);
		System.out.println(user1);
	}

}
