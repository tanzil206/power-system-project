package com.example.application.repository;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.example.application.model.User;



//public interface UserRepository extends JpaRepository<User, Long> {
//
//	public User findIdByEmail (String email);

@Component
public class UserRepository {
	    public User findUserByEmail(String email){
	        User user = new User(email,"123456");
	        user.setFirstName("Tanzil");
	        user.setLastName("Ahmed");
	        return user;
	    }
	}

