package com.javainuse.service;

import com.javainuse.entity.Users;
import com.javainuse.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {

	 @Autowired
	    UsersRepository usersRepository2;

	
		public Users saveUsers(Users users){
	        return usersRepository2.save(users);
	    }

	    public List<Users> getAllUsers(){
	        return usersRepository2.findAll();
	    }

	    public Users getUsersById(Long usersId){
	        return usersRepository2.findById(usersId).get();
	    }

	    public Users updateUsers(Users users){
	    	
	        return usersRepository2.save(users);
	    }

	    public void deleteUsersById(Long usersId){
	    	usersRepository2.deleteById(usersId);
	    }
	
}
