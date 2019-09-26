package com.mbiostudy.blog.repository;

import com.mbiostudy.blog.vo.Board;
import com.mbiostudy.blog.vo.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostDao extends JpaRepository<Post, Long> {

  List<Post> findByAuthor(String author);

  List<Post> findByTitle(String title);

  @Query(value="select post_id, title from POST", nativeQuery=true)
  public List<Object[]> findPostList();


}
