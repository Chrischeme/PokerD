/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerd;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Chris
 */
public class PokerD extends Application {
    Deck deck = new Deck();
    @Override
    public void start(Stage primaryStage) {
        Button printDeck = new Button();
        Button refreshDeck = new Button();
        Button shuffleDeck = new Button();
        Button dealHand = new Button();
        
        printDeck.setText("Print Deck");
        refreshDeck.setText("Refresh Deck");
        shuffleDeck.setText("Shuffle Deck");
        dealHand.setText("Deal Hand");
        
        printDeck.setOnAction(e-> {
            deck.printDeck();
        });
        refreshDeck.setOnAction(e-> {
            deck = new Deck();
        });
        shuffleDeck.setOnAction(e-> {
            deck.shuffle();
        });
        dealHand.setOnAction(e-> {
            deck.dealPokerHand();
        });
        
        StackPane root = new StackPane();
        VBox vPane = new VBox();
        root.getChildren().add(vPane);
        vPane.getChildren().add(printDeck);
        vPane.getChildren().add(refreshDeck);
        vPane.getChildren().add(shuffleDeck);
        vPane.getChildren().add(dealHand);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
