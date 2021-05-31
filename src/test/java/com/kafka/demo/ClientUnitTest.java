package com.kafka.demo;

import com.kafka.demo.models.Client;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClientUnitTest {

	@Test
	public void getClientIdAndContent_positive() throws Exception {
		Client message = new Client(999, "Test_message");
		assertEquals(999, message.getId());
		assertEquals("Test_message", message.getContent());
	}


	@Test
	public void setClientIdAndContent_positive() throws Exception {
		Client message = new Client(999, "Test_message");
		message.setId(998);
		message.setContent("Set_test");
		assertEquals(998, message.getId());
		assertEquals("Set_test", message.getContent());
	}

}