package com.rakesh.jpamap.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid", nullable = false, unique = true)
	private Integer sId;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "age", nullable = false)
	private String age;
	@Column(name = "standard", nullable = false)
	private String standard;
	@Column(name = "address", nullable = false)
	private String address;

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "student", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Book book;

	public Student() {

	}

	public Student(Integer sId, String name, String age, String standard, String address, Book book) {
		super();
		this.sId = sId;
		this.name = name;
		this.age = age;
		this.standard = standard;
		this.address = address;
		this.book = book;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sId=");
		builder.append(sId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", standard=");
		builder.append(standard);
		builder.append(", address=");
		builder.append(address);
		builder.append(", book=");
		builder.append(book);
		builder.append("]");
		return builder.toString();
	}

}
