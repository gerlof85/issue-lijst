package com.github.gerlof85.issuelijst.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class IssueIdTest {

	@Test
	public void create() throws Exception {
		IssueId isseuId = new IssueId("sample-11");
		assertEquals("sample-11", isseuId.getName());

		isseuId = new IssueId("sample-23");
		assertEquals("sample-23", isseuId.getName());

	}

	@Test(expected = IllegalArgumentException.class)
	public void createNull() throws Exception {
		new IssueId(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createSpaces() throws Exception {
		new IssueId("  \t");
	}

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
}
