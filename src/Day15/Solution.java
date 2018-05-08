/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

/**
 *
 * @author Vishal
 */
import java.io.*;
import java.util.*;
 
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
 
public class Solution {
 
    public static  Node insert(Node head,int data) {
      // This is the method which we have to add.
      Node current=head;
       Node temp=null;
        if(current==null)
        {
            temp=new Node(data);
            current=temp;
            return temp;
        }
        
        else 
        {
            Node temp1=current;
          while(current.next!=null)
          {
              current=current.next;
          }
            current.next= new Node(data);
            current= current.next;
            current.data =data;
            
            return temp1;
 
        }   
        
}
public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static void main(String args[]) 
   {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
 
        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
