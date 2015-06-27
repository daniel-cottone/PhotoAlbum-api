package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.UserRepository;
import com.brahalla.PhotoAlbum.domain.entity.User;
import com.brahalla.PhotoAlbum.domain.factory.UserFactory;
import com.brahalla.PhotoAlbum.model.json.UserInfo;
import com.brahalla.PhotoAlbum.service.UserService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

  @Override
	@Transactional
  public User createUser(UserInfo userInfo) {
		User user = UserFactory.createUser(userInfo);
    return this.userRepository.save(user);
  }

  @Override
  public User getUserById(Long id) {
    return this.userRepository.findOne(id);
  }

  @Override
  public List<User> getUserList() {
    return (List<User>) this.userRepository.findAll();
  }

	@Override
	@Transactional
	public User updateUser(Long id, UserInfo userInfo) {
		User user = this.userRepository.findOne(id);
		BeanUtils.copyProperties(userInfo, user);
		return this.userRepository.save(user);
	}

  @Override
	@Transactional
  public User deleteUser(Long id) {
    this.userRepository.delete(id);
		return new User();
  }

}
