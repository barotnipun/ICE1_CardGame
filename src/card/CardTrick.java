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
            c.setValue(rand.nextInt(13) + 1); // 1 to 13
            c.setSuit(suits[rand.nextInt(suits.length)]);
            magicHand[i] = c;
        }

        // User picks a card
        Scanner in = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int pickValue = in.nextInt();
        System.out.print("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String pickSuit = in.next();

        // Search for match
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == pickValue && c.getSuit().equalsIgnoreCase(pickSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
