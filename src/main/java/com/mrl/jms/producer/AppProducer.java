package com.mrl.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppProducer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("producer.xml");
		
		ProducerService producer = ctx.getBean(ProducerService.class);
		
		for (int i = 0; i < 100; i++) {
			producer.sendMessage("test:"+i);
		}
		
		ctx.close();
	}
}
