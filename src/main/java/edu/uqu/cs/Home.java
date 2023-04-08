package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Home{
	public static void main(String [] args){

		// Create an object of type Garage 
                


	        // Add "Toyota Corolla Cross" in the garage. Hint: use method addCar () of class Garage
                

                //List all the cars in the garage. Hint: use method listCars () of class Garage
                

                // Place "Ford Fusion" in the garage. Hint: use method addCar () of class Garage
               
 	        // List all the cars in the garage once again. Hint: use method listCars () of class Garage
                



               // Move out "Ford Fusion" from the garage. Hint: use method moveOut () of class Garage
               


               // List all the cars in the garage. Hint: use method listCars () of class Garage
               Garages G = new Garages(); 
               G.addCar("Toyota Corolla Cross"); 
               G.listCars(); 
               G.addCar("Ford Fusion"); 
               G.listCars(); 
               G.moveOut("Ford Fusion");  
               G.listCars();

        }

}