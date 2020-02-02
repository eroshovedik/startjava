package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    private static int gameNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("У вас осталось " + (10 - i) + " попыток");
                enterNumber(player1, i);
                if (player1.getNumber() == gameNumber) {
                    determineWinner(player1, i);
                    break;
                }

                enterNumber(player2, i);
                if (player2.getNumber() == gameNumber) {
                    determineWinner(player2, i);
                    break;
                }
                hint(player1.getNumber(), gameNumber);
                hint(player2.getNumber(), gameNumber);
                System.out.println("Пока никто не угадал!Попробуйте еще.\n");
            }

            if (player1.getNumber() != gameNumber && player2.getNumber() != gameNumber) {
                player1.showEnterNumbers();
                player2.showEnterNumbers();
            }
            break;
        }
    }

    private void hint(int number, int gameNumber) {
        if (number < gameNumber) {
            System.out.println("Число второго игрока меньше искомого\n");
        } else if (number > gameNumber) {
            System.out.println("Число второго игрока больше искомого\n");
        }
    }

    private void enterNumber(Player player, int i) {
        Scanner scan = new Scanner(System.in);
        System.out.println(player.getName() + " введите число : ");
        player.setNumber(scan.nextInt());
        player.setEnteredNumbers(i, player.getNumber());
    }

    private void determineWinner(Player player, int i) {
        System.out.println("Поздравляем!!!Победил " + player.getName() + "! Это было число  - " + player.getNumber());
        System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + i + " попытки");
    }
}