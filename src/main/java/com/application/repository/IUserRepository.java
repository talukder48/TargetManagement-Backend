package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.application.model.User;
public interface IUserRepository extends JpaRepository<User, String> {

}
