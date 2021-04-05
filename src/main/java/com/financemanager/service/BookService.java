package com.financemanager.service;

import java.util.List;

import com.financemanager.po.BaseModel;
import com.financemanager.po.BookInfo;
import com.financemanager.po.BookTypeInfo;
import com.financemanager.po.ResBaseModel;

public interface BookService {
	
	BookInfo queryBookById(int id);
	
	ResBaseModel queryBooks(BaseModel param);
	
	int addBook(BookInfo bookInfo);
	
	int updateBook(BookInfo bookInfo);
	
	void deleteBook(int bookId);
	
	int addBookType(BookTypeInfo bookTypeInfo);
	
	List<BookTypeInfo> queryAllBookType(BookTypeInfo bookTypeInfo);
	
	int updateBookType(BookTypeInfo bookTypeInfo);
	
	void deleteBookType(int cId);
}
