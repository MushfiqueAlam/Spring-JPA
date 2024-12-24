package com.jpaexample.jpa;

import com.jpaexample.jpa.dao.UserReposetory;
import com.jpaexample.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaApplication {

	private static UserReposetory userReposetory;

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(JpaApplication.class, args);
//		System.out.println("This project with jpa");
		userReposetory = context.getBean(UserReposetory.class);

//		User user=new User();
//		user.setName("Mushfique Alam");
//		user.setCity("Hyderabad");
//		user.setStatus("He is a Java Developer");
//		User user1=userReposetory.save(user);
//		System.out.println(user1);

		//for Create the input we want to make first create the object
		User user1=new User();
		user1.setName("Rakib");
		user1.setCity("Kolkata");
		user1.setStatus("He is a full Stack Developer");

		User user2=new User();
		user2.setName("Amir");
		user2.setCity("Banglore");
		user2.setStatus("He is a Python Dveloper");
		//Saving Single user data
			//User saveUser=userReposetory.save(user1);
			//System.out.println("Saved the data to database"+saveUser);

		//Saving All user data

//			List<User>users=List.of(user1,user2);
//			Iterable<User> saveAllUser=userReposetory.saveAll(users);
//			saveAllUser.forEach(user -> {
//				System.out.println(user);
//			});

		//Update the User data
//			Optional<User> optional = userReposetory.findById(152);
//			User user=optional.get();
//			System.out.println("User is Available "+user);
//			user.setName("Abdur Rakib");
//			 User userUpdate=userReposetory.save(user);
//				System.out.println(userUpdate);

		//To get the Data
		//two method-> (1)=findById(id) return the containing optional data
		//				(2)=findAll()
		Iterable<User> findAllData = userReposetory.findAll();

		//for find all user with iterator
//			Iterator<User> iterator = findAllData.iterator();
//			while(iterator.hasNext()){
//				User user=iterator.next();
//				System.out.println(user);
//			}

		//for find all user using foreach
//			findAllData.forEach(user -> {
//				System.out.println(user);
//			});

		//Delete the user data
		userReposetory.deleteById(1);
		System.out.println("Deleted user by Id");





		System.out.println("Successfully data stored");
	}

}
