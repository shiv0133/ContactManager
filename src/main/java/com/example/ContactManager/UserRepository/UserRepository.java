package com.example.ContactManager.UserRepository;

import com.example.ContactManager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
