package com.github.gerlof85.issuelijst.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.gerlof85.issuelijst.domain.IssueType;

public class IssueTypeTest {

	@Test
	public void fromText() {
		IssueType issueType = IssueType.fromText("bug");
		assertEquals(IssueType.BUG, issueType);

		issueType = IssueType.fromText("  improvement ");
		assertEquals(IssueType.IMPROVEMENT, issueType);
	}

	@Test(expected = IllegalArgumentException.class)
	public void fromTextNull() {
		IssueType.fromText(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void fromTextSpaces() {
		IssueType.fromText(" \t ");
	}

	@Test(expected = IllegalArgumentException.class)
	public void fromTextNotKnow() {
		String issueTypeStr = "unknown";
		try {
			IssueType.fromText(issueTypeStr);
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'issueTypeStr' with value '" + issueTypeStr + "' not a known issue-type. Known issue-types [BUG, IMPROVEMENT].", iae.getMessage());
			throw iae;
		}
	}

}
