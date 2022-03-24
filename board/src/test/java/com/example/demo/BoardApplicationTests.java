package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BoardApplicationTests {

	@Test
	void contextLoads() {
		PasswordEncoder pe = new BCryptPasswordEncoder();
		String pw = pe.encode("1234");
		System.out.println(pw);
		
		// $2a$10$XbKi66ngYRn6aSkxhG7MD.XPR/mnhF2S58v7iOxbN865StTI00JOO
		// $2a$10$N/tfNt1B48kd7kM3pxtoy.77cT5GSZAdqimV63EwQ3gIsOLfsV916
		
		boolean isMatch = pe.matches("1234", "$2a$10$XbKi66ngYRn6aSkxhG7MD.XPR/mnhF2S58v7iOxbN865StTI00JOO");
		
		System.out.println(isMatch);
	}

}
