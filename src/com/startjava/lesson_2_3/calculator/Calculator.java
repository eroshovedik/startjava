package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class Calculator {

    public void calculation() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число:");
            int number1 = scan.nextInt();

            System.out.println("Введите знак математической операции:");
            String sing = scan.next();

            System.out.println("Введите второе число:");
            int number2 = scan.nextInt();

            switch (sing) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    System.out.println(number1 / number2);
                    break;
                case "%":
                    System.out.println(number1 % number2);
                    break;
                case "^":
                    int num = number1;
                    for (int i = 1; i < number2; i++) {
                        number1 *= num;
                    }
                    System.out.println(number1);
                    break;
            }
            break;
        }
    }
}