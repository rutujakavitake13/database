package com.example.database.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class transaction {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private  Integer id;
	@Column(name="status")
	private  String  status;
	

	public transaction() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
