package com.app;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="P")
public class P {
	
	@Id
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
    private String name;
    
    @OneToMany(mappedBy="p",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<C> clist;

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

	public List<C> getClist() {
		return clist;
	}

	public void setClist(List<C> clist) {
		this.clist = clist;
	}

	public P(int id, String name, List<C> clist) {
		super();
		this.id = id;
		this.name = name;
		this.clist = clist;
	}

	public P() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "P [id=" + id + ", name=" + name + "]";
	}

	public P(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
    
    
    

}
