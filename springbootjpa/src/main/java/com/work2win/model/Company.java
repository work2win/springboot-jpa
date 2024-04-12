package com.work2win.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "company")
public class Company implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date date;
	private String status;
	
	public Company() {}
	public Company(Long id, String name, Date date, String status) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", date=" + date + ", status=" + status + "]";
	}
	
	
	
	

}
