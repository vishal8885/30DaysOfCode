/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day26;

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
        int Da = sc.nextInt();
        int Ma = sc.nextInt();
        int Ya = sc.nextInt();
        
        int De = sc.nextInt();
        int Me = sc.nextInt();
        int Ye = sc.nextInt();
        int fine=0;
        if (Ya == Ye){
            if (Ma < Me || (Ma == Me && Da <= De)) {
                fine = 0;
            } else if (Ma == Me) {
                fine = (Da - De) * 15;
            } else if (Ma > Me) {
                fine = (Ma - Me) * 500;
            }
        } else if (Ya > Ye){
            fine = 10000;
        }
        
        System.out.println(fine);
    }
}
