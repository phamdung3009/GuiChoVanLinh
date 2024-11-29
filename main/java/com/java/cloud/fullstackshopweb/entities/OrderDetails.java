package com.java.cloud.fullstackshopweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "order_id")
	private Integer orderId;

	@Column(name = "product_id")
	private Integer productId;

	private Integer quantity;
	private Double price;

	public OrderDetails() {
	}

	public OrderDetails(Integer id, Integer orderId, Integer productId, Integer quantity, Double price) {
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public OrderDetails(Integer orderId, Integer productId, Integer quantity, Double price) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderDetails{" +
				"id=" + id +
				", orderId=" + orderId +
				", productId=" + productId +
				", quantity=" + quantity +
				", price=" + price +
				'}';
	}
}
