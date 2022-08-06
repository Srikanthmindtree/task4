package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import task2.myException;
public class arrayList {
	public static void main(String[] args) throws Exception {
	ArrayList<String> a=new ArrayList<String>();
	Scanner ip=new Scanner(System.in);
	a.add("AVANTHIKA");
	a.add("SHREE PRIYA");
	a.add("MADHUPRIYA");
	a.add("SHRUTHI");
	a.add("MOUNIKA");
	a.add("SUHASINI");
	a.add("VARUNI");
	a.add("JYOTHIKA");
	a.add("RAMYA");
	a.add("MANASA");
    System.out.println("please enter 1 to ascend the custome names");
    System.out.println("please enter 2 to update with their ids and  display the updated age");
    System.out.println("please enter 3 to raise an exceptions");
    int num= ip.nextInt();
    switch (num)
    {
    case 1:
    	if(num==1)
    	{
	Collections.sort(a); 
	System.out.println(a);
    	}
	//update customer id
   
    	
    	case 2:
    	 if(num==2)
    System.out.println("Enter customer id");
   int n=0;
    n=a.size();
    for(int i=0;i<n;i++)
    {
    	 String s=ip.next();
    	 System.out.println("customer name is   "+a.set(i, s)+  " = "+s);
    }
    System.out.println("customer ids");
    System.out.println(a);
    	System.out.println("updating age by their ids");
    System.out.println("enter whos id  do you want to change theri age");
int id=ip.nextInt();
  
    	int i1=a.indexOf(4);
    	System.out.println(i1);
    	//	a.set(i1, "2");
    		
    	
    
    
    
    
    System.out.println("id s "+a.get(2)+"  ");	
    	case 3:
    		
    		if(num==3)
    		{ int l=a.size();
    		 System.out.println("enter a customer id ");
    		 String s1=ip.next();
    		 System.out.println(a);
    			for(int i=0;i<l;i++)
    			
    				if(a.get(i) !=s1)
    				
    					
    					throw new Exception();
    				
    				else
    				
    					System.out.println(a.get(6));
    				
    				
    			
    		}
    	}
	}
}
