package com.mbiostudy.blog.vo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  protected Post() {}

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long postId;

  @Column
  private String categoryId;

  @Column
  private String title;

  @Column
  private String subTitle;

  @Column
  private String imagePath;

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

  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  @Override
  public String toString() {
    return "Post{" +
            "postId=" + postId +
            ", categoryId='" + categoryId + '\'' +
            ", title='" + title + '\'' +
            ", subTitle='" + subTitle + '\'' +
            ", imagePath='" + imagePath + '\'' +
            ", author='" + author + '\'' +
            ", contents='" + contents + '\'' +
            ", regDate=" + regDate +
            ", updtDate=" + updtDate +
            '}';
  }
}
