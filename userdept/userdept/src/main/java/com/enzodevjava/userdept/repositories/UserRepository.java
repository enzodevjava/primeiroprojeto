package com.enzodevjava.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzodevjava.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
