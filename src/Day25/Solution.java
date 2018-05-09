/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day25;

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
        int T = sc.nextInt();
        int a[] = new int[T];
        for(int i=0;i<T;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<T;i++){
            if(isPrime(a[i]))
               System.out.println("Prime");
            else
               System.out.println("Not prime");
        }
    }
    
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int c=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n % i == 0)
                c++;
        }
        if(c==0)
            return true;
        return false;
    }
}