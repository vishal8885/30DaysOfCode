/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
            while(in.hasNext())
            {
           long n = in.nextLong();
        long abc=factorial(n);
        System.out.println(abc);
        }    
    }
    
    public static long factorial(long n)
        {
        if(n==0 || n==1)
            {
            return 1;
        }
        else
            return n*factorial(n-1);
    }
}
