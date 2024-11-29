package com.java.cloud.fullstackshopweb.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "`order`")
public class Order {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cus_id")
	private Integer cusId;

	@Column(name = "order_date")
	private Instant orderDate;

	private Integer amount;
	private Boolean status;

	public Order(Integer id, Integer cusId, Instant orderDate, Integer amount, Boolean status) {
		this.id = id;
		this.cusId = cusId;
		this.orderDate = orderDate;
		this.amount = amount;
		this.status = status;
	}

	public Order(Integer cusId, Instant orderDate, Integer amount, Boolean status) {
		this.cusId = cusId;
		this.orderDate = orderDate;
		this.amount = amount;
		this.status = status;
	}

	public Order() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public Instant getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Instant orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", cusId=" + cusId +
				", orderDate=" + orderDate +
				", amount=" + amount +
				", status=" + status +
				'}';
	}
}
