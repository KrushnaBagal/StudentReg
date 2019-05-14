package com.tcs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {

@Id
private int id;
private String name;
private String address;
private String mail;
private String tech;


public StudentModel(int id, String name, String address, String mail, String tech) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.mail = mail;
	this.tech = tech;
}
public StudentModel() {
}
 int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}

@Override
public String toString() {
	return "StudentModel [id=" + id + ", name=" + name + "]";
}


}
