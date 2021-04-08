package com.financemanager.po;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Family {
	private int fid;
	private String name;
	private Date createTime;
	private String remark;
	private List<Map<String, Object>> members;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<Map<String, Object>> getMembers() {
		return members;
	}
	public void setMembers(List<Map<String, Object>> members) {
		this.members = members;
	}
	
	
}
