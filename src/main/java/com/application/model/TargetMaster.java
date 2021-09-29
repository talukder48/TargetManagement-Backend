package com.application.model;


import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "target_master")
public class TargetMaster {
	@Id
    @Column(name = "TARGET_CODE")
	private String target_code;	
	@Column(name = "START_DATE")
	private Date start_date;
	@Column(name = "END_DATE")
	private Date end_date;
	@Column(name = "TARGET_DESCRIPTION")
	private String target_description;
	@Column(name = "ACTIVE_FLAG")
	private String active_flag;
	@Column(name = "TARGET_REMARKS")
	private String target_remarks;
	@Column(name = "ACTIVATION")
	private String activation;
	@Column(name = "PARENT_CODE")
	private String parent_code;
	
	public TargetMaster() {}
	public TargetMaster(String target_code, Date start_date, Date end_date, String target_description,String active_flag, String target_remarks, String activation, String parent_code) {
		super();
		this.target_code = target_code;
		this.start_date = start_date;
		this.end_date = end_date;
		this.target_description = target_description;
		this.active_flag = active_flag;
		this.target_remarks = target_remarks;
		this.activation = activation;
		this.parent_code = parent_code;
	}
	public String getTarget_code() {
		return target_code;
	}
	public void setTarget_code(String target_code) {
		this.target_code = target_code;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getTarget_description() {
		return target_description;
	}
	public void setTarget_description(String target_description) {
		this.target_description = target_description;
	}
	public String getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}
	public String getTarget_remarks() {
		return target_remarks;
	}
	public void setTarget_remarks(String target_remarks) {
		this.target_remarks = target_remarks;
	}
	public String getActivation() {
		return activation;
	}
	public void setActivation(String activation) {
		this.activation = activation;
	}
	public String getParent_code() {
		return parent_code;
	}
	public void setParent_code(String parent_code) {
		this.parent_code = parent_code;
	}
	@Override
	public String toString() {
		return "TargetMaster [target_code=" + target_code + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", target_description=" + target_description + ", active_flag=" + active_flag + ", target_remarks="
				+ target_remarks + ", activation=" + activation + ", parent_code=" + parent_code + "]";
	}
}
