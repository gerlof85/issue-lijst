package com.github.gerlof85.issuelijst;

import org.apache.commons.lang3.StringUtils;

public enum Priority {
	HIGH,
	MEDIUM,
	LOW,
	EXTRA_LOW;

	public static Priority fromText(String priorityStr) {
		String priorityCln = StringUtils.trimToNull(priorityStr);
		if (priorityCln == null) {
			throw new IllegalArgumentException("Argument 'priorityStr' should not be null.");
		}

		try {
			return valueOf(priorityCln.toUpperCase());
		}
		catch (IllegalArgumentException iae) {
			throw new IllegalArgumentException("Argument 'priorityStr' with value '" + priorityCln 
					+ "' not a known priority. Known priorities [" + asString() + "].");
		}
	}

	private static String asString() {
		StringBuilder bldr = new StringBuilder();
		for (Priority priority : values()) {
			if (bldr.length() > 0) {
				bldr.append(", ");
			}
			bldr.append(priority.name());
		}
		return bldr.toString();
	}
}
