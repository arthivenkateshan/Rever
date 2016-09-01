package lb35;

import java.util.Scanner;

public class rever {
	
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 StringBuffer s=new StringBuffer(sc.next());
	 StringBuffer s1=new StringBuffer(s.reverse());
	 System.out.println(s1);
	 StringBuffer s2=new StringBuffer("aeiou");
	 for(int i=0;i<s2.length();i++)
	  {
	   for(int j=0;j<s1.length();j++)
	   {
	   if(s1.charAt(j)==s2.charAt(i))
	    {
	       //System.out.println(s1.charAt(j));  
		   s1.deleteCharAt(j);
	    
	     }
	}
	}
	 System.out.println(s1);
	 System.out.println(5+"facimile");
	}
	}
	 
	 

