package com.israelfelix.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.israelfelix.workshopmongo.domain.User;
import com.israelfelix.workshopmongo.dto.UserDTO;
import com.israelfelix.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		repo.deleteById(id);
	}
	
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
