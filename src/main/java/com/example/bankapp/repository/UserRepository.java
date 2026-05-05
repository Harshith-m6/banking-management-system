package com.example.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bankapp.entity.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

	

	List<User> findByUsernameAndPassword(String username, String password);

}
