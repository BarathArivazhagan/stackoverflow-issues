package com.app;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="C")
public class C {
	
	@Id
	@Column(name="c_id")
	private int id;
	@Column(name="c_name")
    private String name;
    @OneToMany(mappedBy="c",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<E> elist;
    @ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="p_id")
    private P p;
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
	public List<E> getElist() {
		return elist;
	}
	public void setElist(List<E> elist) {
		this.elist = elist;
	}
	public C(int id, String name, List<E> elist) {
		super();
		this.id = id;
		this.name = name;
		this.elist = elist;
	}
	public C() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "C [id=" + id + ", name=" + name + " ]";
	}
	public C(int id, String name, P p) {
		super();
		this.id = id;
		this.name = name;
		this.p = p;
	}
    
    
    
    

}
