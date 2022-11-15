package com.bootcamp.patterns.lab.exercise2;

import com.bootcamp.patterns.lab.exercise2.beans.Ticket;
import com.bootcamp.patterns.lab.exercise2.beans.TicketList;

public class CalculateTicketTest {

	public static void main(String[] args) {

		TicketList tickets = new TicketList();

		Ticket ticket1 = new Ticket();// children ticket price 10 dollar
		ticket1.setAge(10);// children
		ticket1.setTax(0.20);// tax is 20 %

		Ticket ticket2 = new Ticket();// adult ticket price 15 dollar
		ticket2.setAge(24);// adult
		ticket2.setTax(0.15);// tax is 15 %

		Ticket ticket3 = new Ticket();// adult ticket price 12 dollar
		ticket3.setAge(68);// senior
		ticket3.setTax(0.50);// tax is 50 %

		Ticket ticket4 = new Ticket();
		ticket4.setAge(18);// other category
		ticket4.setPrice(5);// price is 5 dollar
		ticket4.setTax(0.70);// tax is 70 %

		tickets.addItem(ticket1);
		tickets.addItem(ticket2);
		tickets.addItem(ticket3);
		tickets.addItem(ticket4);

		CalculateTicketCategoryService serviceTicket = new CalculateTicketCategoryService();

		for (Ticket ticket : tickets.getTickets()) {

			if (ticket.getPrice() != 0) {// other category

				serviceTicket.calculate(ticket, new OtherCalculateTicket());

			} else {

				if (ticket.getAge() <= 16) {

					serviceTicket.calculate(ticket, new ChildrenCalculateTicket());

				} else if (ticket.getAge() >= 17 && ticket.getAge() < 65) {

					serviceTicket.calculate(ticket, new AdultCalculateTicket());

				} else if (ticket.getAge() >= 65) {

					serviceTicket.calculate(ticket, new SeniorCalculateTicket());

				}
			}

		}

	}

}
