package com.github.gerlof85.issuelijst.domain;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class IssueId {
	private String regExpStr = "\\w+-\\d+";
	private String name;
	
	public IssueId(String name) {
		String nameCln = StringUtils.trimToNull(name);
		if (nameCln == null) {
			throw new IllegalArgumentException("Argument 'name' should not be null.");
		}
		else if (! Pattern.matches(regExpStr, nameCln)) {
			throw new IllegalArgumentException("Argument 'name' with value '" + nameCln + "' is not a valid ID (should follow pattern xxx-# (" + regExpStr + "))");
		}

		this.name = name;
	}

	public Object getName() {
		return name;
	}

}
