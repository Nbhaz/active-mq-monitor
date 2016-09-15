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

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.springframework.stereotype.Service;

/**
 * @author kabraa
 */
@Service
public class JmsMessageSender {

    private ConnectionFactory factory;

    private Connection connection;

    private Session session;

    private MessageProducer producer;

    public JmsMessageSender(ConnectionFactory factory, String queueName) throws JMSException {
        this.factory = factory;
        connection = factory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(queueName);
        producer = session.createProducer(destination);
    }

    public void run() throws JMSException {
        for (int i = 0; i < 100; i++) {
            System.out.println("Creating Message " + i);
            Message message = session.createTextMessage("Hello World!"+i);
            producer.send(message);
        }
    }

    public void close() throws JMSException {
        if (connection != null) {
            connection.close();
        }
    }

}
