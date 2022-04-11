package com.lfpmnds.udemyapirestfulproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfpmnds.udemyapirestfulproject.domain.User;
import com.lfpmnds.udemyapirestfulproject.repositories.UserRepository;
import com.lfpmnds.udemyapirestfulproject.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
