package com.wu.service;

import com.wu.entity.User;

public interface IUserService {
	public User getUserBySname(String name);
	public int addUser(User user);
}
