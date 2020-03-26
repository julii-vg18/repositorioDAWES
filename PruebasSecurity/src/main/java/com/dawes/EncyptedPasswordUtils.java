package com.dawes;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncyptedPasswordUtils {

	public static String encryptePassword(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(password);
	}
	
	public static void main (String [] args) {
		String password = "temporal";
		String encryptedPassword = encryptePassword(password);
		
		System.out.println("Encrypted Password: " + encryptedPassword);
	}
}
