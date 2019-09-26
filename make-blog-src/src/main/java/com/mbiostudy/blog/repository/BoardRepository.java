package com.mbiostudy.blog.repository;

import com.mbiostudy.blog.vo.Board;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

  List<Board> findByAuthor(String author);


}
