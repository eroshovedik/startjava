package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "да";

        while (!answer.equals("нет")) {
            if (answer.equals("да")) {
                System.out.println("Введите математическое выражение:");
                Calculator calculator = new Calculator(scan.nextLine());
                calculator.calculate();
            }
            System.out.println("Хотите продолжить? [да/нет]: ");
            answer = scan.nextLine();
            switch (answer) {
                case "нет":
                    break;
                case "да":
                default:
                    continue;
            }
        }
    }
}