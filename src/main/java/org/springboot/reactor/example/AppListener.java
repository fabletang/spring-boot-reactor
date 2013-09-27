package org.springboot.reactor.example;

import org.springframework.stereotype.Service;

import reactor.event.Event;
import reactor.function.Consumer;

@Service
public class AppListener implements Consumer<Event<User>>{

	public void accept(Event<User> event) {
		System.out.println("Received user object with "
				+ "first name:"
				+ event.getData().firstName
				+ ", last name:"
				+ event.getData().lastName
				+ ", address:"
				+ event.getData().address
				+ ", city:"
				+ event.getData().city
				+ "");
	}
}
