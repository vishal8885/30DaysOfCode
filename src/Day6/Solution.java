/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan1 = new Scanner(System.in);
        int time = scan1.nextInt();
        scan1.nextLine();

        while (time > 0) {

            String str = scan1.nextLine();

            char arr[] = str.toCharArray();
            int len = str.length();

            for (int x = 0; x < len; x = x + 2) {

                System.out.print(arr[x]);

            }

            System.out.print(" ");

            for (int x = 1; x < len; x = x + 2) {

                System.out.print(arr[x]);
            }

            System.out.println();

            time--;
        }
    }
}
