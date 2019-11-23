package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Severity")
public class BugSeverity {
	@Id
	@Column(name="SEVERITY_ID")
	private int Severity_id;
	
	@Column(name="SEVERITY_NAME")
	private String Severity_name;

	public int getSeverity_id() {
		return Severity_id;
	}

	public void setSeverity_id(int severity_id) {
		Severity_id = severity_id;
	}

	public String getSeverity_name() {
		return Severity_name;
	}

	public void setSeverity_name(String severity_name) {
		Severity_name = severity_name;
	}

	@Override
	public String toString() {
		return "BugSeverity [Severity_id=" + Severity_id + ", Severity_name=" + Severity_name + "]";
	}
	
	

}
