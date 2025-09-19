/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */

/**
 * Modifier: Nipun Barot
 * Student ID: 991753659
 * Date Modified: 2025-09-18
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        Random rand = new Random();

        // Fill with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // 1..13
            c.setSuit(suits[rand.nextInt(suits.length)]);
            magicHand[i] = c;
        }

        // Hard-coded lucky card (you can choose any value/suit)
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue()
                    && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        System.out.println(found
                ? "WIN! Lucky card was in the magic hand."
                : "LOSE! Lucky card was not found.");
    }
}
