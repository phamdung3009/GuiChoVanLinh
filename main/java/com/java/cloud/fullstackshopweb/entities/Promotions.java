package com.java.cloud.fullstackshopweb.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "promotions")
public class Promotions {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "pro_id")
	private Integer proId;

	@Column(name = "promotion_type")
	private String promotionType;

	@Column(name = "start_date")
	private Instant startDate;

	@Column(name = "end_date")
	private Instant endDate;

	public Promotions() {
	}

	public Promotions(Integer proId, String promotionType, Instant startDate, Instant endDate) {
		this.proId = proId;
		this.promotionType = promotionType;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Promotions(Integer id, Integer proId, String promotionType, Instant startDate, Instant endDate) {
		this.id = id;
		this.proId = proId;
		this.promotionType = promotionType;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public Instant getStartDate() {
		return startDate;
	}

	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Promotions{" +
				"id=" + id +
				", proId=" + proId +
				", promotionType='" + promotionType + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				'}';
	}
}
