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
public class Ex2_3 extends Application {
    public static final double PI = 3.1415;
    private Random random = new Random();
    private int radius;
    private double area;
    
    @Override
    public void start(Stage primaryStage) {
        radius = 1+ random.nextInt(9);
        area = PI * radius * radius;
        
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
