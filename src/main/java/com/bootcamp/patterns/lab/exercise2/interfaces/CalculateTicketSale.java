package com.bootcamp.patterns.lab.exercise2.interfaces;

import com.bootcamp.patterns.lab.exercise2.beans.Ticket;

public interface CalculateTicketSale {

	int getTicketPrice();

	String displayTicketCategory();

	void calculateTicket(Ticket ticket);

	String getTicketBasicPrice();

	String getPercentage();

	String getSalesPrice();

}
