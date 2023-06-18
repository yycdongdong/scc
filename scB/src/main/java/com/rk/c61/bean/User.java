package com.rk.c61.bean;
import lombok.Data;

@Data
public class User {
  private long id;
  private String name;
  private long sex;
  private java.sql.Timestamp birthday;
  private java.sql.Timestamp created;
  private java.sql.Timestamp modified;



}
