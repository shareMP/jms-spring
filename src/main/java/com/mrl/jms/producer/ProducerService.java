package com.mrl.jms.producer;

/**
 * @author lwqMR
 *	生产者接口
 */
public interface ProducerService {
	void sendMessage(String message);
}
