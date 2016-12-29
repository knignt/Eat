package com.wu.entity;

import java.util.Date;
/**
 * 用户实体类
 * @author Wu
 *
 */
public class User {
	private String sname;
	private String spassword;
	private int sage;
	private Date registdate;  
	
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public Date getRegistdate() {
		return registdate;
	}
	public void setRegistdate(Date registdate) {
		this.registdate = registdate;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {	
		return this.sname+this.sage;
	}
}
