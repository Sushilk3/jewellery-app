package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for undustanding the flow
 * 
 * @author 
 *
 */
@Entity
@Table(name = "gold_price")
public class Gold {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "price")
	private long price;

	@Column(name = "quentity")
	private long quentity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getQuentity() {
		return quentity;
	}

	public void setQuentity(long quentity) {
		this.quentity = quentity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + (int) (quentity ^ (quentity >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gold other = (Gold) obj;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		if (quentity != other.quentity)
			return false;
		return true;
	}

}
