package com.socialmedia.instagramclone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialmedia.instagramclone.Entity.Users;
import com.socialmedia.instagramclone.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("")
	private Users submitUser(@RequestBody Users users) {
	 return userService.submitMetaDataOfUser(users);
	//    return true;
	}
	
	@GetMapping("/{userid}")
	private Users getUserDetails(@PathVariable("userid") String userId) {
	 return userService.displayUserMetaData(userId);
	    
	}
}


