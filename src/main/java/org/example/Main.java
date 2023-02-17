package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game started, please enter the number of players");
        int heroesCount = scanner.nextInt();
        System.out.println(heroesCount);

        Hero[] heroes = new Hero[heroesCount];
        for (int i=0; i < heroesCount; i++) {
            heroes[i] = new Hero(1, i+1);
        }

        for (int i =0; i < heroesCount; i++) {
            System.out.println(heroes[i].toString());
        }


    }
}