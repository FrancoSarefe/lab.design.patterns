package com.bootcamp.patterns.lab.exercise2;

import com.bootcamp.patterns.lab.exercise2.interfaces.CalculateTicketSale;

public class SeniorCalculateTicket extends AbstractTicketSaleComputation implements CalculateTicketSale {

	private static final int SENIOR_TICKET_PRICE = 12;

	@Override
	public int getTicketPrice() {

		return SENIOR_TICKET_PRICE;
	}

	@Override
	public String displayTicketCategory() {
		return "SENIOR TICKET";
	}

}
