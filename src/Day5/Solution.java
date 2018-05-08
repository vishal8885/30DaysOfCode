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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int x = 1; x < 11; x++) {
            System.out.println("" + n + " x " + x + " = " + (n * x));

        }
    }
}
