package com.btl.ltw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.btl.ltw.entity.Comment;
import com.btl.ltw.entity.User;
import com.btl.ltw.service.BookService;
import com.btl.ltw.service.CommentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/save/comment")
	public String addComment(@RequestParam("rating") Integer star, 
			@RequestParam("content") String content
			, @RequestParam("book_id") Integer book_id, HttpSession session) {
		Comment comment = new Comment();
		User user = (User) session.getAttribute("userLogin");
		comment.setUser(user);
		comment.setBook(bookService.getByID(book_id));
		comment.setContent(content);
		comment.setStar(star);
		commentService.save(comment);
		return "redirect:/detail/" + String.valueOf(book_id);
	}

	@DeleteMapping("/delete/comment")
	public String deleteComent (@RequestParam("book_id") Integer book_id
			, HttpSession session
			,@RequestParam("comment_id") Integer comment_id) {
		commentService.delete(comment_id);
		return "redirect:/detail/"+String.valueOf(book_id);
	}
}
