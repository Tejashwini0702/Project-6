package com.Spring.service;
import com.manytomanyrelationship.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;
@Service
public class UsersService {
    @Autowired
    private static com.Spring.repository.UsersRepository usersRepository;
    @SuppressWarnings("unused")
	public ResponseEntity<?> update (@RequestBody Users user,@PathVariable Integer id) {
    	try {
    		Users existuser = UsersService.getUsers(id);
    		Users.setid(id);
    		UsersService.saveUsers(user);
    		 return new ResponseEntity<>( HttpStatus.OK);
    	}
    	catch(NoSuchElementException e) {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
      
    }
	private static Users getUsers(Integer id) {
		return null;
	}
	public static  void saveUsers(Users user) {
		usersRepository.save(user);		
	}
	public ResponseEntity<Object> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}

