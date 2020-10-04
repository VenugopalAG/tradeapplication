package com.example.orderbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.orderbook.server.model.OrderBook;

@Component
public class Producer {

	private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
	Binding binding;

	public String send(Object message) {
		LOGGER.info("Sending message to the queue.");
		OrderBook orderBook = (OrderBook)message;
		rabbitTemplate.convertAndSend(binding.getExchange(), binding.getRoutingKey(), orderBook);
		LOGGER.info("Message sent successfully to the queue, sending back the response to the user.");
		return "Message sent successfully to the queue.";
	}
}
