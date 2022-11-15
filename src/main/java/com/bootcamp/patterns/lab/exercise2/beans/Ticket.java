package com.bootcamp.patterns.lab.exercise2.beans;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Ticket {

	private int age;
	private double price;
	private double tax;
}
