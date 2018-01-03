/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerd;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Chris
 */
public class Deck {
    Stack<Card> deck = new Stack();
    int numCards;
    public Deck() {
        numCards = 52;
        char num = '2';
        for (int i = 0; i < 8; i++) {
            Card c = new Card(num, 'h');
            deck.add(c);
            num++;
        }
        Card c = new Card('a', 'h');
        deck.add(c);
        c = new Card('j', 'h');
        deck.add(c);
        c = new Card('q', 'h');
        deck.add(c);
        c = new Card('k', 'h');
        deck.add(c);
        c = new Card('t', 'h');
        deck.add(c);
        num = '2';
        for (int i = 0; i < 8; i++) {
            c = new Card(num, 'd');
            deck.add(c);
            num++;
        }
        num = '2';
        c = new Card('a', 'd');
        deck.add(c);
        c = new Card('j', 'd');
        deck.add(c);
        c = new Card('q', 'd');
        deck.add(c);
        c = new Card('k', 'd');
        deck.add(c);
        c = new Card('t', 'd');
        deck.add(c);
        for (int i = 0; i < 8; i++) {
            c = new Card(num, 'c');
            deck.add(c);
            num++;
        }
        c = new Card('a', 'c');
        deck.add(c);
        c = new Card('j', 'c');
        deck.add(c);
        c = new Card('q', 'c');
        deck.add(c);
        c = new Card('k', 'c');
        deck.add(c);
        c = new Card('t', 'c');
        deck.add(c);
        num = '2';
        for (int i = 0; i < 8; i++) {
            c = new Card(num, 's');
            deck.add(c);
            num++;
        }
        c = new Card('a', 's');
        deck.add(c);
        c = new Card('j', 's');
        deck.add(c);
        c = new Card('q', 's');
        deck.add(c);
        c = new Card('k', 's');
        deck.add(c);
        c = new Card('t', 's');
        deck.add(c);
    }
    
    public void shuffle() {
        Card[] shuffleArr = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            shuffleArr[i] = deck.pop();
        }
        for (int i = numCards - 1; i > 0; i--) {
            Random r = new Random();
            int rand = r.nextInt(i);
            deck.push(shuffleArr[rand]);
            shuffleArr[rand] = shuffleArr[i];
        }
        deck.push(shuffleArr[0]);
    }
    
    public void printDeck() {
        for (Card c : deck) {
            System.out.println(c.suit + "" + c.num);
        }
    }
    
    public void dealPokerHand() {
        if (numCards >= 5) {
            for (int i = 0; i < 5; i++) {
                Card c = deal();
                System.out.println(c.num + "" + c.suit);
            }
        }
        else {
            System.out.println("Not enough cards in deck");
        }
    }
    
    public Card deal() {
        numCards--;
        return deck.pop();
    }
}
