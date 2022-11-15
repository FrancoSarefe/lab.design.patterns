package com.bootcamp.patterns.lab.exercise2;

import java.text.DecimalFormat;

import com.bootcamp.patterns.lab.exercise2.beans.Ticket;

public abstract class AbstractTicketSaleComputation {

	protected DecimalFormat format = new DecimalFormat("0.#");
	protected double ticketPrice;
	protected double percentage;
	protected double salesPrice;

	public void calculateTicket(Ticket ticket) {

		ticketPrice = getTicketPrice();
		percentage = (ticketPrice * ticket.getTax());
		salesPrice = (ticketPrice + percentage);

	}

	public String getTicketBasicPrice() {
		return format.format(ticketPrice);
	}

	public String getPercentage() {
		return format.format(percentage);
	}

	public String getSalesPrice() {
		return format.format(salesPrice);
	}

	public abstract int getTicketPrice();

}
