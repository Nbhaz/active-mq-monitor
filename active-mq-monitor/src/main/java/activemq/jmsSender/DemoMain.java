/*
 * DemoMain.java
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

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @author kabraa
 */
public class DemoMain {

    public static String brokerURL = "tcp://localhost:61618";

    public static void main(String[] args) {

        // setup the connection to ActiveMQ
        ConnectionFactory factory = new ActiveMQConnectionFactory(brokerURL);

        JmsMessageSender producer;
        try {
            producer = new JmsMessageSender(factory, "test");

            producer.run();
            producer.close();
        } catch (JMSException e) {
            System.out.println(e.getMessage());
        }

    }

}
