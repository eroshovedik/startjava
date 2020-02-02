package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void setEnteredNumbers(int i, int numbers) {
        this.enteredNumbers[i] = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void showEnterNumbers() {
        System.out.println("У " + this.getName() + " закончились попытки");
        System.out.println(this.getName() + " называл следующие цифры: ");
        for (int num : this.getEnteredNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.fill(this.getEnteredNumbers(), 0);
    }
}