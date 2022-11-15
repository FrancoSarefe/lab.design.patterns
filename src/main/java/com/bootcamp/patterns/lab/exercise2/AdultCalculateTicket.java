package com.bootcamp.patterns.lab.exercise2;

import com.bootcamp.patterns.lab.exercise2.interfaces.CalculateTicketSale;

public class AdultCalculateTicket extends AbstractTicketSaleComputation implements CalculateTicketSale {

	private static final int ADULT_TICKET_PRICE = 15;

	@Override
	public int getTicketPrice() {
		return ADULT_TICKET_PRICE;
	}

	@Override
	public String displayTicketCategory() {
		return "ADULT TICKET";
	}

}
