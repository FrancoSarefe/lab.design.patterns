package com.bootcamp.patterns.lab.exercise2;

import com.bootcamp.patterns.lab.exercise2.beans.Ticket;
import com.bootcamp.patterns.lab.exercise2.interfaces.CalculateTicketSale;

public class OtherCalculateTicket extends AbstractTicketSaleComputation implements CalculateTicketSale {

	@Override
	public void calculateTicket(Ticket ticket) {

		ticketPrice = ticket.getPrice();
		percentage = (ticketPrice * ticket.getTax());
		salesPrice = (ticketPrice + percentage);

	}

	@Override
	public String displayTicketCategory() {
		return "OTHER CATEGORY TICKET";
	}

	@Override
	public int getTicketPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
