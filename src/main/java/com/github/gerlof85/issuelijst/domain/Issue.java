package com.github.gerlof85.issuelijst.domain;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class Issue {
// declaraties
private final String issueId;
private final String creationDate;
private String description;
private Status status;
private final Priority priority;
private final IssueType issueType;

	// constructor
	//String issueId, Enum issueType, Enum priority, String status, Date creationDate, String description
	public Issue (String issueId, IssueType bug, Priority medium, String statusNaam, String creationDate, String description) {
		this.issueId = issueId;
		issueType = IssueType.BUG;
		priority = Priority.MEDIUM;
		status = new Status("open");
		this.creationDate = creationDate;
		this.description = description;
	}

	public String getIssueId() {
		return issueId;   //vraag: hoe hier de waarde van issueID te returnen?
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public IssueType getIssueType() {
		return IssueType.BUG;
	}
	
	public Priority getPriority() {
		return Priority.MEDIUM;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public String getStatusString(){
		return status.getName();
	}
	
	public String getCreationDate() {
		return creationDate;
	}

	public String getDescription() {
		return description;
	}
	
	
	// return?
}
