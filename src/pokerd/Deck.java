/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerd;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Chris
 */
public class Deck {
    Stack<Card> deck = new Stack();
    public void Deck() {
        char num = '2';
        for (int i = 0; i < 9; i++) {
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
        num = '2';
        for (int i = 0; i < 9; i++) {
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
        for (int i = 0; i < 9; i++) {
            c = new Card(num, 'c');
        }
        c = new Card('a', 'c');
        deck.add(c);
        c = new Card('j', 'c');
        deck.add(c);
        c = new Card('q', 'c');
        deck.add(c);
        c = new Card('k', 'c');
        deck.add(c);
        num = '2';
        for (int i = 0; i < 9; i++) {
            c = new Card(num, 's');
        }
        c = new Card('a', 's');
        deck.add(c);
        c = new Card('j', 's');
        deck.add(c);
        c = new Card('q', 's');
        deck.add(c);
        c = new Card('k', 's');
        deck.add(c);
    }
    
    public void shuffle() {
        
    }
    
    public void printDeck() {
        for (Card c : deck) {
            System.out.println(c.suit + c.num);
        }
    }
}
