package com.github.gerlof85.issuelijst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriorityTest {

	@Test
	public void fromText() {
		Priority priority = Priority.fromText("low");
		assertEquals(Priority.LOW, priority);

		priority = Priority.fromText("  high ");
		assertEquals(Priority.HIGH, priority);
	}

	@Test(expected = IllegalArgumentException.class)
	public void fromTextNotKnow() {
		String priorityStr = "unknown";
		try {
			Priority.fromText(priorityStr);
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'priorityStr' with value '" + priorityStr + "' not a known priority. Known priorities [HIGH, MEDIUM, LOW, EXTRA_LOW].", iae.getMessage());
			throw iae;
		}
	}

}
