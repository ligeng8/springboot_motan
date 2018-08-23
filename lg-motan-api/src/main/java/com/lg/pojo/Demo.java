package com.lg.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author ligeng3
 *
 */
public class Demo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2694205118606116637L;

	private BigDecimal id;

	private String name;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
