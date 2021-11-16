package com.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.User;
import com.application.repository.IUserRepository;

@CrossOrigin(origins = "http://192.168.100.221:3000")
@RestController
public class LogInController {
	@Autowired
	private IUserRepository UserService;
	@PostMapping("/api/LogIn/{UserId}/{Password}")
	public String GetLogInAccess(@PathVariable String UserId,@PathVariable String Password) {
		String DataMap=null;
		if (UserService.existsById(UserId)) {
			User usermaster = UserService.findById(UserId).orElseThrow();
			String userPassword =usermaster.getPassword().toString();
			DataMap=UserService.findById(UserId).toString();
			System.out.println(DataMap);
			
		} else {
			System.out.println("User Id not Found");
		}
				
		return UserService.findById(UserId).toString();
	}

}
