package com.github.gerlof85.issuelijst;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriorityTest {

	@Test
	public void fromText() {
		Priority priority = Priority.fromText("low");
		assertEquals(Priority.LOW, priority);

		priority = Priority.fromText("high");
		assertEquals(Priority.HIGH, priority);
	}

	@Test(expected = IllegalArgumentException.class)
	public void fromTextNotKnow() {
		try {
			Priority.fromText("help");
		}
		catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
			assertEquals("Argument 'priorityStr' with value 'help' not a known priority. Known priorities [HIGH, MEDIUM, LOW].", iae.getMessage());
			throw iae;
		}
	}

}
