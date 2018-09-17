package com.song.Entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "exchange_details")
public class ExchangeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String picture;//图片
	private String productName;//商品说明
	private String type;//商品分类0:橙意满满,1,电影大片,2品质生活
	private Integer needIntegral;//所需积分
	private String detailsContent;//详情说明
	private String exchangeNoticeContent;//兑换须知
	private String goodsValus;//市场价
	private String status;//所需积分
	private Date createTime;//开始时间
	private Date endTime;//结束时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getNeedIntegral() {
		return needIntegral;
	}
	public void setNeedIntegral(Integer needIntegral) {
		this.needIntegral = needIntegral;
	}
	public String getDetailsContent() {
		return detailsContent;
	}
	public void setDetailsContent(String detailsContent) {
		this.detailsContent = detailsContent;
	}
	public String getExchangeNoticeContent() {
		return exchangeNoticeContent;
	}
	public void setExchangeNoticeContent(String exchangeNoticeContent) {
		this.exchangeNoticeContent = exchangeNoticeContent;
	}
	public String getGoodsValus() {
		return goodsValus;
	}
	public void setGoodsValus(String goodsValus) {
		this.goodsValus = goodsValus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ExchangeDetails [id=" + id + ", picture=" + picture
				+ ", productName=" + productName + ", type=" + type
				+ ", needIntegral=" + needIntegral + ", detailsContent="
				+ detailsContent + ", exchangeNoticeContent="
				+ exchangeNoticeContent + ", goodsValus=" + goodsValus
				+ ", status=" + status + ", createTime=" + createTime
				+ ", endTime=" + endTime + "]";
	}

	
}
