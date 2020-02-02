package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String expression;

    public Calculator(String expression) {
        this.expression = expression;
    }

    public void calculate() {
            String[] enteredExpression = expression.split(" ");
            int number1 = Integer.parseInt(enteredExpression[0]);
            int number2 = Integer.parseInt(enteredExpression[2]);
            String sing = enteredExpression[1];
            switch (sing) {
                case "+":
                    System.out.println(Math.addExact(number1, number2));
                    break;
                case "-":
                    System.out.println(Math.subtractExact(number1, number2));
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
                    System.out.println(Math.pow(number1,number2));
                    break;
            }
    }
}