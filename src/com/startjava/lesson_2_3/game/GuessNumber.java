package com.startjava.lesson_2_3.game;
import java.util.Scanner; // импорт сканера


public class GuessNumber {

    private static int gameNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Первый игрок введите число : ");
            player1.setNumber(scan.nextInt());
            if ( player1.getNumber() == gameNumber) {
                System.out.println("Поздравляем!!!Победил " + player1.getName() + "! Это было число  - " + player1.getNumber());
                break;
            }

            System.out.println("Второй игрок введите число : ");
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() == gameNumber) {
                System.out.println("Поздравляем!!!Победил " + player2.getName() + "! Это было число  - " + player2.getNumber());
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
            break;
        }
    }
}