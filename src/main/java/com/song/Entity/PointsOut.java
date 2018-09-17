package com.song.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_app_points_out")

public class PointsOut {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String uid;
	protected String telnum;
	protected String qrcode;
	protected String username;
	protected int pointscount;
	protected String ipaddress;
	protected Date outtime;
	protected String fromaddress;
	protected String toaddress;
	protected String txid;
	protected String tag;
	protected Short status;
	protected Long orderDetailsId;
	protected String orderDetailsProductName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTelnum() {
		return telnum;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public String getQrcode() {
		return qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPointscount() {
		return pointscount;
	}
	public void setPointscount(int pointscount) {
		this.pointscount = pointscount;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	
	public String getOrderDetailsProductName() {
		return orderDetailsProductName;
	}
	public void setOrderDetailsProductName(String orderDetailsProductName) {
		this.orderDetailsProductName = orderDetailsProductName;
	}
	public String getFromaddress() {
		return fromaddress;
	}
	public void setFromaddress(String fromaddress) {
		this.fromaddress = fromaddress;
	}
	public String getToaddress() {
		return toaddress;
	}
	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	
	public Long getOrderDetailsId() {
		return orderDetailsId;
	}
	public void setOrderDetailsId(Long orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}
	@Override
	public String toString() {
		return "PointsOut [id=" + id + ", uid=" + uid + ", telnum=" + telnum
				+ ", qrcode=" + qrcode + ", username=" + username
				+ ", pointscount=" + pointscount + ", ipaddress=" + ipaddress
				+ ", outtime=" + outtime + ", fromaddress=" + fromaddress
				+ ", toaddress=" + toaddress + ", txid=" + txid + ", tag="
				+ tag + ", status=" + status + ", orderNo=" + orderDetailsId + "]";
	}
	



}
