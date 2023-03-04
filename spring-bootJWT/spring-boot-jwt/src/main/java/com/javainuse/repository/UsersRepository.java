package com.javainuse.repository;

import com.javainuse.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Long>{

}
