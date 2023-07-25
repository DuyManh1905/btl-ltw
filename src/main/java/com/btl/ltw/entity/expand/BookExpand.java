package com.btl.ltw.entity.expand;

import com.btl.ltw.entity.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookExpand {
	
	private Book book;
	private String avgStar;
}
