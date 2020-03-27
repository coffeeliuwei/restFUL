package com.coffee.entity;

import com.coffee.mysql.annotation.COLUMNS;
import com.coffee.mysql.annotation.TABLE;
//bean  DTO Data Transfer Object

@TABLE(name="Student")
@COLUMNS(generated="id")
public class user extends IdAbstract {
  private String name;
  private String password;
  private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "user [name=" + name + ", password=" + password + ", email=" + email
			+ "]";
}
  
}
