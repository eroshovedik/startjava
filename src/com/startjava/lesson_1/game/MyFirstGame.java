package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int gameNumber = 23;
		int number = 99;

		while(true) {
		if(gameNumber == number) {
			System.out.println("Вы угадали!");
			break;
		} else if(number > gameNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			number = number / 2;
		} else if(number < gameNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
			number = number + number / 2 + 1;
		}
		} 
	}
}