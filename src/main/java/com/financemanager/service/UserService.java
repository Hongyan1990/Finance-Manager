package com.financemanager.service;

import com.financemanager.po.BookInfo;
import com.financemanager.po.UserInfo;

public interface UserService {
	UserInfo getUserById(int uid);
	int addUser(UserInfo userInfo);
	void updateUser(UserInfo userInfo);
//	BookInfo queryBookById(int id);
}
