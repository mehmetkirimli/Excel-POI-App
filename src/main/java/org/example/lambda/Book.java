package org.example.lambda;

import java.util.Date;

public class Book
{
  private String name;
  private Long page ;
  private String author;
  private Date creatingDate;

  public Book(String name, Long page, String author, Date creatingDate) {
    this.name = name;
    this.page = page;
    this.author = author;
    this.creatingDate = creatingDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getCreatingDate() {
    return creatingDate;
  }

  public void setCreatingDate(Date creatingDate) {
    this.creatingDate = creatingDate;
  }
}
