package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
//	user 에 선언된걸 사용한다.
public User findByEmailAndPwd(String email, String pwd);

}
