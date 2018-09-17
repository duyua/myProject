package com.song.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_app_points_detail")
public class PointsDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String uid;
	protected String telnum;
	protected String qrcode;
	protected String username;
	protected Integer pointscount;
	protected Integer sumpoints;
	protected Integer gettype;
	protected Date gettime;
	protected Date endtime;
	protected String source;
	protected String txid;
	protected String recevicetime;
	protected String receviceaddress;
	protected String beizhu;
	protected Short status;
	protected Integer type;
	protected String productName;
    
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

	public Integer getPointscount() {
		return pointscount;
	}

	public void setPointscount(Integer pointscount) {
		this.pointscount = pointscount;
	}

	public Integer getSumpoints() {
		return sumpoints;
	}

	public void setSumpoints(Integer sumpoints) {
		this.sumpoints = sumpoints;
	}

	public Integer getGettype() {
		return gettype;
	}

	public void setGettype(Integer gettype) {
		this.gettype = gettype;
	}

	public Date getGettime() {
		return gettime;
	}

	public void setGettime(Date gettime) {
		this.gettime = gettime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public String getRecevicetime() {
		return recevicetime;
	}

	public void setRecevicetime(String recevicetime) {
		this.recevicetime = recevicetime;
	}

	public String getReceviceaddress() {
		return receviceaddress;
	}

	public void setReceviceaddress(String receviceaddress) {
		this.receviceaddress = receviceaddress;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


}
