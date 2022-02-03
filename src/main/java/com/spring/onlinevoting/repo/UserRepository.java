package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
