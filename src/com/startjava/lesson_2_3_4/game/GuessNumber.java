package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private static int gameNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("У вас осталось " + (10 - i) + " попыток");
            enterNumber(player1, i);
            if (player1.getNumber() == gameNumber) {
                determineWinner(player1, player2, i);
                break;
            }

            enterNumber(player2, i);
            if (player2.getNumber() == gameNumber) {
                determineWinner(player2, player1, i);
                break;
            }
            compare(player1);
            compare(player2);
            System.out.println("Пока никто не угадал!Попробуйте еще.\n");
        }

        if (player1.getNumber() != gameNumber && player2.getNumber() != gameNumber) {
            System.out.println("У " + player1.getName() + " закончились попытки");
            showEnterNumbers(player1, player1.getEnteredNumbers().length);
            System.out.println("У " + player2.getName() + " закончились попытки");
            showEnterNumbers(player2, player1.getEnteredNumbers().length);
        }
    }
    private void enterNumber(Player player, int i) {
        System.out.println(player.getName() + " введите число : ");
        player.setNumber(scan.nextInt());
        player.setEnteredNumber(i);
    }

    private void determineWinner(Player player, Player player2, int i) {
        System.out.println("Поздравляем!!!Победил " + player.getName() + "! Это было число  - " + player.getNumber());
        System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + i + " попытки");
        showEnterNumbers(player,i);
        showEnterNumbers(player2,i);
    }

    private void compare(Player player) {
        if (player.getNumber() < gameNumber) {
            System.out.println("Число " + player.getName() + " меньше искомого\n");
        } else if (player.getNumber() > gameNumber) {
            System.out.println("Число " + player.getName() + " больше искомого\n");
        }
    }

    private void showEnterNumbers(Player player, int i) {
        System.out.println(player.getName() + " называл следующие цифры: ");
        int[] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(),i);
        for (int num : enteredNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.fill(player.getEnteredNumbers(), 0);
    }
}