package com.iris.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bug_Description")
public class BugAllocationDetail {
	@Id
	
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="BugAllocate_Type_Id")
	private int bugAllocateId;
	
	@Column(name="Planned_Start_Date")
	private Date plannedStartDate;
	
	@Column(name="Planned_End_Date")
	private Date plannedEndDate;
	
	@Column(name="Actual_Start_Date")
	private Date actualStartDate;
	
	@Column(name="Actual_End_Date")
	private Date actualEndDate;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="userid")
	private int userid;
	
	@Column(name="p_id")
	private String p_Id;
	
	@Column(name="bugtype_id")
	private String bugTypeId;
	
	@Column(name="Severity_id")
	private String severityId;
	
	@Column(name="status_id")
	private String statusId;

	public int getBugAllocateId() {
		return bugAllocateId;
	}

	public void setBugAllocateId(int bugAllocateId) {
		this.bugAllocateId = bugAllocateId;
	}

	public Date getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public Date getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getP_Id() {
		return p_Id;
	}

	public void setP_Id(String p_Id) {
		this.p_Id = p_Id;
	}

	public String getBugTypeId() {
		return bugTypeId;
	}

	public void setBugTypeId(String bugTypeId) {
		this.bugTypeId = bugTypeId;
	}

	public String getSeverityId() {
		return severityId;
	}

	public void setSeverityId(String severityId) {
		this.severityId = severityId;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	@Override
	public String toString() {
		return "BugAllocationDetail [bugAllocateId=" + bugAllocateId + ", plannedStartDate=" + plannedStartDate
				+ ", plannedEndDate=" + plannedEndDate + ", actualStartDate=" + actualStartDate + ", actualEndDate="
				+ actualEndDate + ", description=" + description + ", userid=" + userid + ", p_Id=" + p_Id
				+ ", bugTypeId=" + bugTypeId + ", severityId=" + severityId + ", statusId=" + statusId + "]";
	}
	
}
