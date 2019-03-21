package com.accp.springmvc_2.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Person {

	private Integer personId;
	private String personName;
	private Byte personSex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date personDate;
	private String personImg;

	public String getPersonImg() {
		return personImg;
	}

	public void setPersonImg(String personImg) {
		this.personImg = personImg;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Byte getPersonSex() {
		return personSex;
	}

	public void setPersonSex(Byte personSex) {
		this.personSex = personSex;
	}

	public Date getPersonDate() {
		return personDate;
	}

	public void setPersonDate(Date personDate) {
		this.personDate = personDate;
	}

	public Person(Integer personId, String personName, Byte personSex,
			Date personDate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSex = personSex;
		this.personDate = personDate;
	}

	public Person(String personName, Byte personSex, Date personDate) {
		super();
		this.personName = personName;
		this.personSex = personSex;
		this.personDate = personDate;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return this.getPersonId() + "\t" + this.getPersonName() + "\t"
				+ this.getPersonSex() + "\t" + this.getPersonDate() + "\t"
				+ this.getPersonImg();
	}

	public Person(Integer personId) {
		super();
		this.personId = personId;
	}

}
