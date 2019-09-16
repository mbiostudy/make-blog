package com.mbiostudy.blog.vo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  protected Post() {}

  public Post(String categoryId, String title, String author, String contents, Date regDate, Date updtDate) {
    this.categoryId = categoryId;
    this.title = title;
    this.author = author;
    this.contents = contents;
    this.regDate = regDate;
    this.updtDate = updtDate;
  }

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long postId;

  @Column
  private String categoryId;

  @Column
  private String title;

  @Column
  private String author;

  @Column
  private String contents;

  @Column
  private Date regDate;

  @Column
  private Date updtDate;

  public Long getPostId() {
    return postId;
  }

  public void setPostId(Long postId) {
    this.postId = postId;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }

  public Date getUpdtDate() {
    return updtDate;
  }

  public void setUpdtDate(Date updtDate) {
    this.updtDate = updtDate;
  }

  @Override
  public String toString() {
    return "Post{" +
            "postId=" + postId +
            ", categoryId='" + categoryId + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", contents='" + contents + '\'' +
            ", regDate=" + regDate +
            ", updtDate=" + updtDate +
            '}';
  }
}
