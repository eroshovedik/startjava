package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 5;
		char sign = '^';
		if(sign == '^') {
			int num = number1;
			for(int i = 0;i < number2; i++) {
				number1 *= num;	
			}
			System.out.println(number1);
		} else if(sign == '-') {
			System.out.println(number1 - number2);
		} else if(sign == '+') {
			System.out.println(number1 + number2);
		} else if(sign == '*') {
			System.out.println(number1 * number2);
		} else if(sign == '/') {
			System.out.println(number1 / number2);
		} else if(sign == '%') {
			System.out.println(number1 % number2);
		}
	}
}