package com.intern.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.file.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long>{

}
