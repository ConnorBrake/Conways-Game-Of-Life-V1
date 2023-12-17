/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conways.game.of.life.v1;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConwaysGameOfLifeV1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args)throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        
        boolean life = true;
        boolean movementX = true;
        boolean movementY = true;
        
        //X Axis Min and Max 
        System.out.print("X Axis Minimum Value: ");
        int xMin = scan.nextInt();
        System.out.print("X Axis Maximum Value: ");
        int xMax = scan.nextInt();
        //Y Axis Min and Max
        System.out.print("Y Axis Minimum Value: ");
        int yMin = scan.nextInt();
        System.out.print("Y Axis Maximum Value: ");
        int yMax = scan.nextInt();
        //Starting Coordinates For X and Y
        System.out.print("Input Position X: ");
        int x = scan.nextInt();
        System.out.print("Input Position Y: ");
        int y = scan.nextInt();
        
        //Shows User(s) The Starting Configuration
        System.out.println("Starting X and Y Coordinates: " + "[" + x + ", " + y + "]");
        
        //Algorithim
        while(life == true){
            //Delay Between Runs So Printing is Readable
            TimeUnit.MILLISECONDS.sleep(500);
            if(x == xMax){
                movementX = false;
            }
            if(x == xMin){
                movementX = true;
            }
            if(movementX == false){
                x -= 1;
            }
            if(movementX == true){
                x += 1;
            }
            if(y == yMax){
                movementY = false;
            }
            if(y == yMin){
                movementY = true;
            }
            if(movementY == false){
                y -= 1;
            }
            if(movementY == true){
                y += 1;
            }
            //Print The New X and Y Coordinates
            System.out.println("[" + x + ", " + y + "]");
        }
}
}
