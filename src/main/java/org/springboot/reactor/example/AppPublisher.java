package org.springboot.reactor.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.Reactor;
import reactor.event.Event;

@Service
public class AppPublisher {

	@Autowired
	Reactor reactor;

	public void publishData() throws InterruptedException {
		reactor.notify("eventHandler", Event.wrap(createData()));
		System.out.println("y0, I sent something for you!!");
	}

	private User createData() {
		User user = new User();
		user.firstName = "Chetan";
		user.lastName = "Birajdar";
		user.address = "410 S Hauser";
		user.city = "Los Angeles";
		
		return user;
	}
	
}
