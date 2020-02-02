package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        String answer = "да";
        GuessNumber game = new GuessNumber(player1,player2);

        while (!answer.equals("нет")) {
            if(answer.equals("да")) {
                game.start();
            }
            System.out.println("Хотите продолжить? [да/нет]: ");
            answer = scan.next();
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