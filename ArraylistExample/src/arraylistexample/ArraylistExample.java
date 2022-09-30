/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistexample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author charm
 */
public class ArraylistExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Arraylist :  This is an resizable array that can be found in the java.uyil package 
       // Tt is part of cellection framework.Array list allows us to randomly access the list.
       
       //1.Creating an array list of integers 
       ArrayList<String> cars = new ArrayList<String>();
       
       //adding items to list
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("FORD");
       cars.add("MAZDA");
       cars.add("TOYOTA");
       
       //PRINT THE LIST
        System.out.println(cars);
        
        //accessing item  use the get() method
        System.out.println("The car at  position 1 is  " +  cars.get(0));
        
        // use set() method to change the item in the array list
        System.out.println("Change MAZDA TO :mazda: " );
        cars.set(3, " mazda");
        System.out.println(cars);
        
        //remove single item
        cars.remove(4);
        System.out.println("Remove position 4 "+cars);
        
        //remove all clear the arraylist
         //cars.clear();
        //System.out.println("Clear ");
       
        
        //get the size of the array
        System.out.println("Size" + cars.size());
        
        //sort ab arraylist
        Collections.sort(cars);
        for(String i :cars){
            System.out.println(i);
        }
 
       
    }
    
}
