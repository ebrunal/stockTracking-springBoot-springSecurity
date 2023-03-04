package com.javainuse.controller;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.javainuse.entity.Users;
import com.javainuse.service.UsersService;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UsersController {
	
	  @Autowired
	    UsersService usersService;

	    @PostMapping("/save")
	    public ResponseEntity<Users> saveUsers(@RequestBody Users users){
	    	Users savedUsers = usersService.saveUsers(users);
	        return new ResponseEntity<Users>(savedUsers, HttpStatus.CREATED);
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<Users>> getAllUsers(){
	        List<Users> allUsers = usersService.getAllUsers();
	        return new ResponseEntity<List<Users>>(allUsers, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Users> getUsersById(@PathVariable(name = "id") Long usersId){
	    	Users users = usersService.getUsersById(usersId);
	        return new ResponseEntity<Users>(users, HttpStatus.OK);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<Users> updateUsersById(@RequestBody Users users){
	    	Users updatedUsers = usersService.updateUsers(users);
	        return new ResponseEntity<Users>(updatedUsers, HttpStatus.OK);
	    } 

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteUsersById(@PathVariable(name = "id") Long usersId){
	    	usersService.deleteUsersById(usersId);
	        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	    }

	
}
