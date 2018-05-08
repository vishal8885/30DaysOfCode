/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Solution {
     public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
          if((n>=2 && n<=5) || n>20)
             {
              
              ans="Not Weird";
              
          }
          else if(n>=6 && n<=20)
          {
              ans ="Weird";
          }
      }
      System.out.println(ans);
   }
}
