package com.mrl.jms.producer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Resource(name = "topicDestination")
	private Destination destination;

	public void sendMessage(final String message) {
		//ʹ��jmsTemplate������Ϣ
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMesage = session.createTextMessage(message);
				return textMesage;
			}
		});
		System.out.println("������Ϣ:"+message);
	}

}
