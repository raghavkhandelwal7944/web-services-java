package com.springrest.springrest.student;
import jakarta.persistence.*;
@Entity
@Table(name="students_table")
public class Students {
	
	public Students(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="StudID")
	private int id;
	@Column(name="StudNAME")
	private String name;
	@Column(name="StudAGE")
	private int age;
	@Column(name="StudEMAIL")
	private String email;
	public int getId() {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	
}
