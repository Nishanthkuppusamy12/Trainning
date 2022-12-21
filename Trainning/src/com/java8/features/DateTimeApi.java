package com.java8.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class DateTimeApi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		LocalDateTime ldt = LocalDateTime.of(dt, tt);
		System.out.println(ldt);
		LocalDate ldt1 = LocalDate.of(2000,7,12);
		Period p = Period.between(dt, ldt1);
		System.out.printf("age is %d years %d months %d days " ,p.getYears(),p.getMonths(),p.getDays());
		System.out.println(dt.plusMonths(7));
		System.out.println(dt.minusWeeks(78));
		int d= p.getYears()*365+p.getMonths()*30+p.getDays();
		System.out.printf("%d days completed from  your mothers stomach",d);
		System.out.println("------>");
		System.out.println("Enter the Year");
		int n=sc.nextInt();
		Year y = Year.of(n);
		
		if(y.isLeap()) {
			System.out.printf("%d is leapyear ",n);
		}
		else {
			System.out.printf("%d is not a leapyear ",n);
		}
		
		
	}
}
