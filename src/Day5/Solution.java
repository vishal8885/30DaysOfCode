/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int testCaseNum = sc.nextInt();
          for (int i = 0; i < testCaseNum; i++) {
              int a = sc.nextInt();
              int b = sc.nextInt();
              int n = sc.nextInt();
              int num = a;
              for (int j = 0; j < n; j++) {
                  num += b*Math.pow(2, j);
                  System.out.print(num + " ");
              }
              System.out.println();
          }
    }
}
