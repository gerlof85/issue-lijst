package com.github.gerlof85.issuelijst;

public enum Priority {
	HIGH,
	MEDIUM,
	LOW,
	EXTRA_LOW;

	public static Priority fromText(String priorityStr) {
		try {
			return valueOf(priorityStr.toUpperCase());
		}
		catch (IllegalArgumentException iae) {
			throw new IllegalArgumentException("Argument 'priorityStr' with value '" + priorityStr 
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
