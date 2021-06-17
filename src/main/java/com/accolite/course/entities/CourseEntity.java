package com.accolite.course.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String title;
    private int number;
    private int numCredits;
   
    public CourseEntity() {
    }
 
  
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getNumCredits() {
		return numCredits;
	}


	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}


	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", type=" + type + ", title=" + title + ", number=" + number + ", numCredits="
				+ numCredits + "]";
	}  
}

