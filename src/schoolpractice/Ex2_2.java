/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolpractice;

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author johanwendt
 */
public class Ex2_2 extends Application {
    private int firstDice, secondDice, ThirdDice;
    private Random random = new Random();
    
    
    @Override
    public void start(Stage primaryStage) {
        firstDice = 1+ random.nextInt(5);
        secondDice = 1+ random.nextInt(5);
        ThirdDice = 1+ random.nextInt(5);
        System.out.println(firstDice + " " + secondDice + " " + ThirdDice);
        System.out.println(firstDice + secondDice + ThirdDice);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
