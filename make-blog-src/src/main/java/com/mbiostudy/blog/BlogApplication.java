package com.mbiostudy.blog;

import com.mbiostudy.blog.repository.BoardRepository;
import com.mbiostudy.blog.vo.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

  private static final Logger log = LoggerFactory.getLogger(BlogApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(BlogApplication.class);
  }

//  @Bean
//  public CommandLineRunner testJpa(BoardRepository repository) {
//    return (args) -> {
//      // save a couple of board
//      repository.save(new Board("Gwangtae","First", "contents1", "2019-09-07"));
//      repository.save(new Board("Jihong","Second", "contents2", "2019-09-07"));
//      repository.save(new Board("Sangjun","Third", "contents3", "2019-09-07"));
//      repository.save(new Board("Youngsun","Fourth", "contents4", "2019-09-07"));
//
//      // fetch all board vo
//      log.info("Board found with findAll():");
//      log.info("-------------------------------");
//      for (Board board : repository.findAll()) {
//        log.info(board.toString());
//      }
//      log.info("");
//
//      // fetch an individual board by ID
//      repository.findById(1L)
//          .ifPresent(board -> {
//            log.info("Board found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(board.toString());
//            log.info("");
//          });
//
//      // fetch board by author
//      log.info("board found with findByAuthor('Sangjun'):");
//      log.info("--------------------------------------------");
//      repository.findByAuthor("Sangjun").forEach(Sangjun -> {
//        log.info(Sangjun.toString());
//      });
//      // for (Customer bauer : repository.findByLastName("Bauer")) {
//      // 	log.info(bauer.toString());
//      // }
//      log.info("");
//    };
//  }

}
