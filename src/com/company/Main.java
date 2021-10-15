package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<card> cardList = new ArrayList<card>();

    static void generateCard(){
        String[] suits = {"clubs", "hearts", "diamonds", "spades"};
        String[] faceValues = {"2", "3" , "4", "5", "6", "7", "8", "9", "10", "jack", "king", "Queen", "ace"};
        for (int i = 0; i < suits.length ; i++) {
            for (int j = 0; j < faceValues.length; j++) {
                card newCards = new card(suits[i], faceValues[j]);
                cardList.add(newCards);

            }

        }

        //card newCards = new card("Hearts", "queen");
        //cardList.add(newCards);
    }

    static void shuffleCards(){
        generateCard();
        Random random = new Random();
        Collections.shuffle(cardList);
        int number = random.nextInt(cardList.size());
        System.out.println(cardList.get(number).getValue());

    }

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int compScore = card() + card();
        int num1 = card();
        int num2 = card();
        int userScore = num1 + num2;
        System.out.println("Your first card is " + num1 + " your second card is " + num2);
        while (userScore < 22) {
            System.out.println("Would you like a new card");
            if (input.next().equals("yes")) ;*/

        shuffleCards();
    }
}
