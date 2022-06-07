package com.spring.main;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int pid;
	private String pname;
	private float pprice;
	public String madein;
	public int getPid() {
		return pid;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	
	@Override
	public String toString() {
    	return "Product [pid=" + pid +", pname=" + pname +",pprice=" + pprice +",madein="+ madein +"]";
	}
}
