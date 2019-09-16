package com.mbiostudy.blog.repository;

import com.mbiostudy.blog.vo.Board;
import com.mbiostudy.blog.vo.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostDao extends JpaRepository<Post, Long> {

  List<Post> findByAuthor(String author);

}
