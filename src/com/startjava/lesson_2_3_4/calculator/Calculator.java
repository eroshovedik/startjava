package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class Calculator {

    public void calculation() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите математическое выражение:");
            String expression = scan.nextLine();
            String [] array = expression.split(" ");
            int number1 = Integer.parseInt(array[0]);
            int number2 = Integer.parseInt(array[2]);
            String sing = array[1];
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