package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao dao;
	@Transactional
	public Integer saveUser(User u) {
		return dao.saveUser(u);
	}

	@Transactional
	public void updateUser(User u) {
		dao.updateUser(u);		
	}

	@Transactional
	public void deleteUser(Integer id) {
		dao.deleteUser(id);
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserById(Integer id) {
		return dao.getUserById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Object[]> getUserCountByRole() {
		return dao.getUserCountByRole();
	}

}
