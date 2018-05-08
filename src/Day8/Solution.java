/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Solution {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> abc=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            abc.put(name,phone);           
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(abc.containsKey(s))
                {
                System.out.println(s+ "=" + abc.get(s));
            }
            else
                {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
