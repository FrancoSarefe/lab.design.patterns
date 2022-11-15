package com.bootcamp.patterns.lab.exercise2;

import com.bootcamp.patterns.lab.exercise2.interfaces.CalculateTicketSale;

public class ChildrenCalculateTicket extends AbstractTicketSaleComputation implements CalculateTicketSale {

	private static final int CHILDREN_TICKET_PRICE = 10;

	@Override
	public int getTicketPrice() {

		return CHILDREN_TICKET_PRICE;
	}

	@Override
	public String displayTicketCategory() {

		return "CHILDREN TICKET";
	}

}
