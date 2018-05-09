/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day28;

/**
 *
 * @author Vishal
 */
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
          try{
              Pattern.compile(pattern);
              System.out.println("Valid");
          }
          catch(PatternSyntaxException pse){
              System.out.println("Invalid");
          }
      }
   }
}

