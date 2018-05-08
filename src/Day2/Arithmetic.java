/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;


/**
 *
 * @author Vishal
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      sc.close();
      
        // Write your calculation code here.
        double tip= ((M*T)/100);
        double tax=((M*X)/100);
        double num= tip + tax + M;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(num);
      
        // Print your result
        System.out.printf("The final price of the meal is $%d.",totalCost);
      
    }
}
