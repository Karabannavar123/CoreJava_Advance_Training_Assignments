package com.advancetraining.java;

import com.advancetraining.java.NameNotValidException;
import com.advancetraining.java.AgeNotWithinRangeException;

public class Student {
	int roll,age;
    String name,course;
    Student()
    {
         roll=0;
         name=null;
         age=0;
         course=null;
    }
    Student(int r,String n,int a,String c) throws Exception
    {
         roll=r;
         course=c;
         int l,temp=0;
         l = n.length();
         for(int i=0;i<l;i++)
         {
              char ch;
              ch=n.charAt(i);
              if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                   temp=1;
         }
         /*-Checking Name*/
         try
         {
              if(temp==1)
                   throw new Exception();
              else
                   name=n;
         }
         catch(NameNotValidException e2)
         {
              System.out.println(e2);
         }
         /*-Checking Age*/
         
    }
    void display()
    {
         System.out.println("roll Name Age Course");
         System.out.println("---------------------");
         System.out.println(roll+" "+name+" "+age+" " +course);
    }
}
