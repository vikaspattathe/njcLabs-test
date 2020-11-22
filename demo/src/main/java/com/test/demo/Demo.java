package com.test.demo;
import javax.persistence.*;

@Entity
public class Demo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
  private char sex;
  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
  }
  
  public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}

  public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex=sex;
	}

}