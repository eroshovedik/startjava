package com.startjava.lesson_2_3_4.game;

import java.util.Scanner; // импорт сканера


public class GuessNumber {

    private static int gameNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    private int[] arrayOfFirstPlayer = new int[10];
    private int[] arrayOfSecondPlayer = new int[10];

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("У вас осталось " + (10 - i) + " попыток");
                System.out.println("Первый игрок введите число : ");
                player1.setNumber(scan.nextInt());
                arrayOfFirstPlayer[i] = player1.getNumber();
                if (player1.getNumber() == gameNumber) {
                    System.out.println("Поздравляем!!!Победил " + player1.getName() + "! Это было число  - " + player1.getNumber());
                    System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + i + " попытки");
                    break;
                }

                System.out.println("Второй игрок введите число : ");
                player2.setNumber(scan.nextInt());
                arrayOfSecondPlayer[i] = player2.getNumber();
                if (player2.getNumber() == gameNumber) {
                    System.out.println("Поздравляем!!!Победил " + player2.getName() + "! Это было число  - " + player2.getNumber());
                    System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + i + " попытки");
                    break;
                }

                if (player1.getNumber() < gameNumber) {
                    System.out.println("Число первого игрока меньше искомого");
                } else if (player1.getNumber() > gameNumber) {
                    System.out.println("Число первого игрока больше искомого");
                }

                if (player2.getNumber() < gameNumber) {
                    System.out.println("Число второго игрока меньше искомого\n");
                } else if (player2.getNumber() > gameNumber) {
                    System.out.println("Число второго игрока больше искомого\n");
                }
                System.out.println("Пока никто не угадал!Попробуйте еще.\n");
            }

            if (player1.getNumber() != gameNumber || player2.getNumber() != gameNumber) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                System.out.println(player1.getName() + " называл следующие цифры: ");
                for (int num : arrayOfFirstPlayer) {
                    System.out.print(num + " ");
                }
                System.out.println();

                System.out.println("У " + player2.getName() + " закончились попытки");
                System.out.println(player2.getName() + " называл следующие цифры: ");
                for (int num : arrayOfSecondPlayer) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            break;
        }
    }
}