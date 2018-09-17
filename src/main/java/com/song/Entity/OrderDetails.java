package com.song.Entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userPhone;//商品说明
	private String receiverPhone;//收货人手机号
	private String receiverName;//收货人姓名
	private String productName;//商品说明
	private String productPicture;//商品图片
	private String billType;//账单类型
	private String orderNo;//订单号
	private Long exchangeDetailsId;//订单号
	private String receiverAddress;
	private Long integralCount;
	private Long integralAmount;
	private String status;
	private Date createTime;
	private Date finishTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public Long getIntegralCount() {
		return integralCount;
	}
	public void setIntegralCount(Long integralCount) {
		this.integralCount = integralCount;
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
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public String getProductPicture() {
		return productPicture;
	}
	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	
	
	public Long getIntegralAmount() {
		return integralAmount;
	}
	public void setIntegralAmount(Long integralAmount) {
		this.integralAmount = integralAmount;
	}
	public Long getExchangeDetailsId() {
		return exchangeDetailsId;
	}
	public void setExchangeDetailsId(Long exchangeDetailsId) {
		this.exchangeDetailsId = exchangeDetailsId;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", userPhone=" + userPhone
				+ ", receiverPhone=" + receiverPhone + ", receiverName="
				+ receiverName + ", productName=" + productName
				+ ", productPicture=" + productPicture + ", billType="
				+ billType + ", orderNo=" + orderNo + ", exchangeDetailsId="
				+ exchangeDetailsId + ", receiverAddress=" + receiverAddress
				+ ", integralCount=" + integralCount + ", integralAmount="
				+ integralAmount + ", status=" + status + ", createTime="
				+ createTime + ", finishTime=" + finishTime + "]";
	}
	
	
}
