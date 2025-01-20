package com.felipe.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipe.workshopmongo.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{

}
