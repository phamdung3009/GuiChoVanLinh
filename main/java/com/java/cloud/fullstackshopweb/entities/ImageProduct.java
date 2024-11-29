package com.java.cloud.fullstackshopweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "imgae_product")
public class ImageProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String image;
	@Column(name = "pro_id")
	private Integer proId;

	public ImageProduct() {
	}

	public ImageProduct(Integer id, String image, Integer proId) {
		this.id = id;
		this.image = image;
		this.proId = proId;
	}

	public ImageProduct(String image, Integer proId) {
		this.image = image;
		this.proId = proId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	@Override
	public String toString() {
		return "ImageProduct{" +
				"id=" + id +
				", image='" + image + '\'' +
				", proId=" + proId +
				'}';
	}
}
