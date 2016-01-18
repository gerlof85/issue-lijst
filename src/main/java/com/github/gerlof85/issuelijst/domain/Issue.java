package com.github.gerlof85.issuelijst.domain;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class Issue {
private static Object Status;
// declaraties
private final String issueId;
private final String creationDate;
private final String description;

	// constructor
	//String issueId, Enum issueType, Enum priority, String status, Date creationDate, String description
	public Issue (String issueId, IssueType bug, Priority medium, String statusNaam, String creationDate, String description) {
		this.issueId = issueId;
		IssueType issueType = IssueType.BUG;
		Priority priority = Priority.MEDIUM;
		Status status = new Status("open");
		this.creationDate = creationDate;
		this.description = description;
	}

	public String getIssueId() {
		return "sample";   //vraag: hoe hier de waarde van issueID te returnen?
	}

	public IssueType getIssueType() {
		return IssueType.BUG;
	}
	
	public Priority getPriority() {
		return Priority.MEDIUM;
	}
	
	public Status getStatus() {
		//return Issue.Status.getClass().getName();
		return null;
	}
	
	public String getCreationDate() {
		return creationDate;
	}

	public String getDescription() {
		return description;
	}
	
	
	// return?
}
