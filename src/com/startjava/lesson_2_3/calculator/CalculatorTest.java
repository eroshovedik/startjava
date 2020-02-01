package com.startjava.lesson_2_3.calculator;
import java.util.Scanner; // импорт сканера

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "да";

        while (!answer.equals("нет")) {
            if (answer.equals("да")) {
                calculator.calculation();
            }
            System.out.println("Хотите продолжить? [да/нет]: ");
            answer = scan.next();
            switch (answer) {
                case "да":
                    continue;
                case "нет":
                    break;
                default:
                    continue;
            }
        }
    }
}