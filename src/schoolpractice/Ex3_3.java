/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolpractice;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author johanwendt
 */
public class Ex3_3 extends Application {
    private Scanner scan = new Scanner(System.in);
    private int total, left, twenty, ten, five, one;
    
    
    @Override
    public void start(Stage primaryStage) {
        System.out.print("Vilket belopp ska växlas?");
        
        String change = JOptionPane.showInputDialog("Vilket belopp ska växlas?");
        total = left = Integer.parseInt(change);
        
        while (left >= 20) {
            twenty ++;
            left -= 20;
        }
        if (left >= 10) {
            ten ++;
            left -= 10;
        }
        if (left >= 5) {
            five ++;
            left -= 5;
        }
        one = left;
        

        JOptionPane.showMessageDialog(null, "20: " + twenty + "/n" + "10: " + ten + "/n" + "5: " + five + "/n" + "1: " + one);


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}