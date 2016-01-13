package com.github.gerlof85.issuelijst.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.gerlof85.issuelijst.domain.Status;

public class StatusTest {
	
	@Test
	public void testStatus(){
		Status status = new Status("open");
		
		assertNotNull(status);
		assertEquals("open", status.getName());
	}
	
}