package com.bootcamp.patterns.lab.exercise2;

import com.bootcamp.patterns.lab.exercise2.beans.Ticket;
import com.bootcamp.patterns.lab.exercise2.interfaces.CalculateTicketSale;

public class CalculateTicketCategoryService {

	public void calculate(Ticket ticket, CalculateTicketSale category) {
		System.out.println(category.displayTicketCategory());
		category.calculateTicket(ticket);
		System.out.println("Ticket Basic Price: " + category.getTicketBasicPrice() + "$");
		System.out.println("Tax Percentage: " + ticket.getTax() + "%");
		System.out.println("Tax: " + category.getPercentage() + "$");
		System.out.println("Ticket Sale Price: " + category.getSalesPrice() + "$" + "\n");
	}// SERVICE

}
