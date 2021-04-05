package com.financemanager.dao;

import java.util.List;
import java.util.Map;

import com.financemanager.po.BaseModel;
import com.financemanager.po.BookInfo;
import com.financemanager.po.BookTypeInfo;

public interface BookMapper {
	BookInfo queryBookById(int id);
	
	List<Map<String, Object>> queryBooks(BaseModel param);
	
	int addBook(BookInfo bookInfo);
	
	int updateBook(BookInfo bookInfo);
	
	void deleteBook(int bookId);
	
	int addBookType(BookTypeInfo bookTypeInfo);
	
	List<BookTypeInfo> queryAllBookType(BookTypeInfo bookTypeInfo);
	
	int updateBookType(BookTypeInfo bookTypeInfo);
	
	void deleteBookType(int cId);
	
	int queryBookCount(BaseModel param);
}
