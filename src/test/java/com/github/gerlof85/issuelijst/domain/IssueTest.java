package com.github.gerlof85.issuelijst.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class IssueTest {

	//benodigde objecten aanmaken
	IssueId isseuId = new IssueId("sample-11");
	Status status = new Status("open");
	
	//goedsituatie
	@Test
	public void create() throws Exception {
		Issue isseu = new Issue(IssueId.class.getName(),IssueType.BUG,Priority.MEDIUM,Status.class.getName(),"18-01-2016","Omschrijving eerste bug");
		//assertEquals("sample-11", isseu.getIssueId());
		assertEquals(IssueType.BUG, isseu.getIssueType());
		assertEquals(Priority.MEDIUM, isseu.getPriority());
		//assertEquals(Status.class.getName(), isseu.getStatus());
	}

	/*
	// leeg issue aanmaken
	@Test(expected = IllegalArgumentException.class)
	public void createNull() throws Exception {
		new Issue(null);
	}
	
	//ongeldige vulling
	@Test(expected = IllegalArgumentException.class)
	public void createSpaces() throws Exception {
		new Issue("  \t");
	}
	*/
	/* ??
	@Test(expected = IllegalArgumentException.class)
	public void createNumber() throws Exception {
		try {
			new IssueId("11");
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'name' with value '" + "11" + "' is not a valid ID (should follow pattern xxx-# (\\w+-\\d+))", iae.getMessage());
			throw iae;
		}
	}
	*/
}
