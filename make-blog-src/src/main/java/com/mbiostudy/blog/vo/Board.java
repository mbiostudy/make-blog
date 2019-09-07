package com.mbiostudy.blog.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {

  protected Board() {}

  public Board(String author, String title, String contents, String date) {
    this.author = author;
    this.title = title;
    this.contents = contents;
    this.date = date;
  }

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String author;
  private String title;
  private String contents;
  private String date;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Board{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", contents='" + contents + '\'' +
        ", date='" + date + '\'' +
        '}';
  }
}
