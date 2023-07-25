package com.btl.ltw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btl.ltw.entity.Comment;
import com.btl.ltw.repository.CommentRepository;
import com.btl.ltw.service.CommentService;

import jakarta.transaction.Transactional;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public List<Comment> getCommentByBook_id(Integer book_id) {
		return commentRepository.getCommentByBook_id(book_id);
	}

	@Override
	public void save(Comment comment) {
		commentRepository.save(comment);
	}
	
	@Transactional
	@Override
	public void deleteCommentByUserID(Integer user_id) {
		commentRepository.deleteByUser_id(user_id);
	}
	
	@Transactional
	@Override
	public void deleteCommentByBookID(Integer book_id) {
		commentRepository.deleteByBook_id(book_id);
	}

	@Transactional
	@Override
	public void delete(Integer comment_id) {
		commentRepository.delete(commentRepository.findById(comment_id).get());
		
	}

}
