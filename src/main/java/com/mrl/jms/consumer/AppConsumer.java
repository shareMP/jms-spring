package com.mrl.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lwqMR
 *	������
 */
public class AppConsumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
		
	}
}
