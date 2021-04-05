package com.financemanager.dao;

import com.financemanager.po.BookInfo;
import com.financemanager.po.UserInfo;

public interface UserInfoMapper {
	UserInfo selectUserById(int uid);
	int addUser(UserInfo userInfo);
	void updateUser(UserInfo userInfo);
//	BookInfo queryBookById(int id);
}
