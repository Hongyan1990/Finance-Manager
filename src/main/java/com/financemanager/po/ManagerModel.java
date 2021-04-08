package com.financemanager.po;

import java.util.Date;
import java.util.Map;

public class ManagerModel {
	private int id;
	private int uid;
	private int fid;
	private int tp;
	private float amount;
	private Date createTime;
	private Date updateTime;
	private int payType;
	private String detail;
	private String remark;
	private Map<String, Object> user;
	private Map<String, Object> family;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getTp() {
		return tp;
	}
	public void setTp(int tp) {
		this.tp = tp;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Map<String, Object> getUser() {
		return user;
	}
	public void setUser(Map<String, Object> user) {
		this.user = user;
	}
	public Map<String, Object> getFamily() {
		return family;
	}
	public void setFamily(Map<String, Object> family) {
		this.family = family;
	}
	
	
}
