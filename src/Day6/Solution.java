/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;


/**
 *
 * @author Vishal
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
          int height = sc.nextInt();
          for (int level = 1; level <= height; level++) {
            for (int step = 0; step < level; step++) {
                  if (step == 0) {
                      for (int k = 0; k < height - level; k++) {
                          System.out.print(" ");
                      }
                  }
                  System.out.print("#");
                }
              System.out.println();
            }
    }
}