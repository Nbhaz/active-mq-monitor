package activemq.jmsReceiver;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

public class JmsMessageReceiver implements MessageListener {

	@Override
	public void onMessage(Message message) {
		if(message  instanceof TextMessage ) {
			System.out.println(message.toString());
		} else if(message instanceof ObjectMessage) {
			System.out.println(message.toString());
			
		} else {
			System.out.println("what the fuck are you sending !!");
		}

	}

}
