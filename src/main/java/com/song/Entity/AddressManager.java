package com.song.Entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "address_manager")
public class AddressManager {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userPhone;//用户注册手机号
	private String userName;//姓名
	private String receiverAddress;//收货人地址(省市区)
	private String addressDetails;
	private String receiverPhone;//收货手机号
	private String isDefault;//是否是默认地址(0,是,1,否)
	private String status;//地址的状态(0:正常1,已删除)
	private Date createTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
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

	@Override
	public String toString() {
		return "AddressManager{" +
				"id=" + id +
				", userPhone='" + userPhone + '\'' +
				", userName='" + userName + '\'' +
				", receiverAddress='" + receiverAddress + '\'' +
				", addressDetails='" + addressDetails + '\'' +
				", receiverPhone='" + receiverPhone + '\'' +
				", isDefault='" + isDefault + '\'' +
				", status='" + status + '\'' +
				", createTime=" + createTime +
				'}';
	}
}
