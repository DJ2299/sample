/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author divya jasani
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        int userValue;
        String userSuit;
        Scanner value = new Scanner(System.in);
        System.out.println("TYPE YOUR CARD VALUE HERE:- ");
        userValue = value.nextInt();
        Scanner suit = new Scanner(System.in);
        System.out.println("TYPE YOUR CARD SUIT HERE:- ");
        userSuit = suit.nextLine();
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
