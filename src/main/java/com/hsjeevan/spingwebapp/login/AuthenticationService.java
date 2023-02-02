package com.hsjeevan.spingwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("hsjeevan");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidPassword && isValidUserName;
	}
}
