package com.bootcamp.patterns.lab.exercise2.beans;

import java.util.ArrayList;
import java.util.List;

public class TicketList {

	private List<Ticket> tickets;

	public TicketList() {
		tickets = new ArrayList<>();
	}

	public void addItem(Ticket ticket) {
		if (ticket == null) {
			throw new IllegalArgumentException("Item cannot be null.");
		}
		this.tickets.add(ticket);
	}

	public float getTotalAmount() {
		float totalAmount = 0F;
		for (Ticket item : tickets) {
			totalAmount += item.getPrice();
		}
		return totalAmount;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}
}
