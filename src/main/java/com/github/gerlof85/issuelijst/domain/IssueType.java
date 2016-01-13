package com.github.gerlof85.issuelijst.domain;

import org.apache.commons.lang3.StringUtils;

public enum IssueType {
	BUG,
	IMPROVEMENT;

	public static IssueType fromText(String issueTypeStr) {
		String issueTypeCln = StringUtils.trimToNull(issueTypeStr);
		if (issueTypeCln == null) {
			throw new IllegalArgumentException("Argument 'issueTypeStr' should not be null.");
		}

		try {
			return valueOf(issueTypeCln.toUpperCase());
		}
		catch (IllegalArgumentException iae) {
			throw new IllegalArgumentException("Argument 'issueTypeStr' with value '" + issueTypeCln 
					+ "' not a known issue-type. Known issue-types [" + asString() + "].");
		}
	}

	private static String asString() {
		StringBuilder bldr = new StringBuilder();
		for (IssueType priority : values()) {
			if (bldr.length() > 0) {
				bldr.append(", ");
			}
			bldr.append(priority.name());
		}
		return bldr.toString();
	}
}
