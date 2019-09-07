package com.mbiostudy.blog.repository;

import com.mbiostudy.blog.vo.Board;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {

  List<Board> findByAuthor(String author);
}
