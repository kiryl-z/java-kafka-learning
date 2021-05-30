package com.kafka.demo;

import com.kafka.demo.models.MessageBody;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class MessageBodyUnitTest {

	private MessageBody messageBody;

	@Test
	public void getMessageIdAndContent_positive() throws Exception {
		messageBody = new MessageBody(999, "Test_message");
		assertEquals(999, messageBody.getId());
		assertEquals("Test_message", messageBody.getContent());
	};

	@Test
	public void setMessageIdAndContent_positive() throws Exception {
		messageBody = new MessageBody(999, "Test_message");
		messageBody.setId(998);
		messageBody.setContent("Set_test");
		assertEquals(998, messageBody.getId());
		assertEquals("Set_test", messageBody.getContent());
	}
}