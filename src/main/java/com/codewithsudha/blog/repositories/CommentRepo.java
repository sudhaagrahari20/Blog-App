package com.codewithsudha.blog.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsudha.blog.entities.Comment;



public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}

