/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_7;
//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class customsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        //ArrayList
        ArrayList<employee>list=new ArrayList<>();
        
        //Array of objects of class employee
        employee e[]=new employee[20];
        
        //Getting 20 employee details
        System.out.println("ENTER 20 EMPLOYEES DETAILS:");
        for(int i=0;i<20;i++)
        {
            System.out.println("Enter details of employee "+(i+1));
            e[i]=new employee();
            System.out.println("----------------");
            
            //adding(storing) data of employee class to ArrayList
            list.add(e[i]);
        }
        System.out.println("===================\nDisplaying employee details:\n"+list);
        
        //Sorting employee details according to Names of the employees in descending order
        Collections.sort(list,new namesort());
        System.out.println("===================\nDisplaying Sorted Employee details in Descending order:\n"+list);
        
    }
    
}

//employee class with attributes [name,salary]
class employee
{
    String name;
    double salary;
    Scanner val=new Scanner(System.in);
    employee()
    {
        
        System.out.println("Enter Name:");
        name=val.next();
        System.out.println("Enter Salary:");
        salary=val.nextDouble();
    }
    @Override
    public String toString()
    {
        return "\nName:"+name+"\tSalary:Rs."+salary;
    }
            
}

//importing Comparator interface for custom sorting
class namesort implements Comparator<employee>
{
    @Override  //custom sort method--->to sort in descending order
    public int compare(employee e1,employee e2)
    {
        return e2.name.compareTo(e1.name);
    }
}