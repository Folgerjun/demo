package com.tonglei.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user", schema = "test")
public class User implements Serializable {

	@Id
	@Column(name = "id", unique = true)
	private Integer id;

	@Column(name = "age")
	private Integer age;

	@Column(name = "name")
	private String name;

	@Column(name = "height")
	private Double height;

	@Column(name = "gmt_create")
	private Date createTime;

	@Column(name = "gmt_modified")
	private Date updateTime;

	public User() {
	}

	public User(Integer id, Integer age, String name, Double height, Date createTime, Date updateTime) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.height = height;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
