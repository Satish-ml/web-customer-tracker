package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login")
public class Login {
    @Column(name="name")
    private String name;
    
    @Column(name="pass")
   private String pass;
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Login(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [name=" + name + ", pass=" + pass + "]";
	}
	
	
}
	
	


