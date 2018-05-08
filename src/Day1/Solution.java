/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double k = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println(i + j);
        System.out.println(d + k);
        System.out.println(s + "" + str);
        scan.close();
    }
}
