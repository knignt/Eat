package com.wu.dao;

import com.wu.entity.User;

public interface IUserDao {
	public User getUserBySname(String name);
	public int addUser(User user);
}
