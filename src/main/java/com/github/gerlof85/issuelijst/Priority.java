package com.github.gerlof85.issuelijst;

public enum Priority {
	HIGH,
	MEDIUM,
	LOW;

	public static Priority fromText(String priorityStr) {
		try {
			return valueOf(priorityStr.toUpperCase());
		}
		catch (IllegalArgumentException iae) {
			throw new IllegalArgumentException("Argument 'priorityStr' with value 'help' not a known priority. Known priorities [HIGH, MEDIUM, LOW].");
		}
	}
}
