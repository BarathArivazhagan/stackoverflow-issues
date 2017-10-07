package com.app;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="E")
public class E {
	
	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_name")
    private String name;
    
    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="c_id")
    private C c;
    
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
	public E(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public E() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "E [id=" + id + ", name=" + name + "]";
	}
	public E(int id, String name, C c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	
	
    
    
    
}
