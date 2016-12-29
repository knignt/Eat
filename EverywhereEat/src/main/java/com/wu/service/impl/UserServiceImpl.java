package com.wu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wu.dao.IUserDao;
import com.wu.entity.User;
import com.wu.service.IUserService;
@Service("UserService")
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDao dao;
	@Override
	public User getUserBySname(String name) {
		return dao.getUserBySname(name);
	}

	@Override
	public int addUser(User user) {
		dao.addUser(user);
		return 0;
	}
	
}
