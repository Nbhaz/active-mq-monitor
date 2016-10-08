/*
 * JmsMessageSender.java
 * 
 */

/*
 * Copyright (c) 2016 D. E. Shaw & Co., L.P. All rights reserved.
 *  
 * This software is the confidential and proprietary information
 * of D. E. Shaw & Co., L.P. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with D. E. Shaw & Co., L.P.
 */

package activemq.jmsSender;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

public class JmsMessageSender {

	private JmsTemplate jmsTemplate;

	private Destination destination;

	public void send(String message) {
		jmsTemplate.send(destination, new JmsMessageCreator(message));
	}

	private static final class JmsMessageCreator implements MessageCreator {

		private final String notification;

		private JmsMessageCreator(String notification) {
			this.notification = notification;
		}

		@Override
		public Message createMessage(Session session) throws JMSException {
			Message message = session.createObjectMessage(notification);
			return message;
		}
	}

}
