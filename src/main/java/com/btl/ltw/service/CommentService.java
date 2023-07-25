package com.btl.ltw.service;

import java.util.List;

import com.btl.ltw.entity.Comment;

public interface CommentService {
	
	List<Comment> getCommentByBook_id(Integer book_id);
	
	void save(Comment comment);
	
	void deleteCommentByUserID(Integer user_id);
	
	void deleteCommentByBookID(Integer book_id);
	
	void delete(Integer comment_id);
}
