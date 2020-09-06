/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_7;
//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Array_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        //Creating ArrayList
        ArrayList<Integer>list=new ArrayList<>();
        char ch;
        int s=0,avg;
        do
        {
            System.out.println("Enter data to be added to the list:");
            int ele=val.nextInt();
            list.add(ele);
            System.out.println("Do you wanna continue adding data to the list??");
            ch=val.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        System.out.println("====================\nList:\n"+list);
       
        
        //1.......Printing average of array elements
        for(int i:list)
        {
          s+=i;  
        }
        avg=s/list.size();
        System.out.println("====================\nAverage of list numbers="+(double)avg);
        
        //2.......Printing highest and lowest number
       
        //2)i)using Collections Package
        System.out.println("====================\nHighest number in the list is:"+(Collections.max(list))+"\nLowest number in the list is:"+(Collections.min(list)));
        
        
        //2)ii)using enhanced for loop
        int high=list.get(0);
        int low=list.get(0);
        for(int i:list)
        {
            if(i>high)
                high=i;
            if(i<low)
                low=i;
        }
        System.out.println("====================\nHighest number in the list:"+high+"\nLowest number in the list:"+low);
        
        //3.......Filtering out all even numbers
        
        //3)i)using lambda expression
        list.removeIf(e->(e%2!=0));
        System.out.println("====================\nEven numbers in the list are:\n"+list);
        
        //3)ii)using enhanced for loop
        for(int i:list)
        {
            if(i%2!=0)
                list.remove(i);
        }
        System.out.println("====================\nEven numbers in the list are:\n"+list);
        
        //3)iii)using simple for loop
        System.out.println("====================\nEven numbers in the list are:");
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2==0)
            {
                System.out.print(list.get(i)+" ");
            }
        }

    }
    
}
