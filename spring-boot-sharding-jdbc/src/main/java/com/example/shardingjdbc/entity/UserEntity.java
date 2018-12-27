package com.example.shardingjdbc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测试用户类
 * 
 * @author ffj
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "user")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6171110531081112401L;
	@Id
	private int id;
	@Column(length = 32)
	private String name;
	@Column(length = 16)
	private int age;

}
