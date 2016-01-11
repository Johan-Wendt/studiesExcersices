/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolpractice;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author johanwendt
 */
public class Ex3_2 extends Application {
    Scanner scan = new Scanner(System.in);
    int t, m, s;
    
    
    @Override
    public void start(Stage primaryStage) {
        scan.useDelimiter(":|//s");
        System.out.print("Mata in tim, min och sek på formen (tt:mm:ss)	");
        t = scan.nextInt();
        m = scan.nextInt();
        s = scan.nextInt();
                
      //  m = scan.nextInt();
      //  s = scan.nextInt();
        
        int total = (( t * 60 ) + m ) * 60  + s;
        System.out.println("/n Det blir " + total + " sekunder.");


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
