package com.Collections;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
//import java.sql.Array;

public class AllCollections
{
	public static void main(String args[])
	{
		Lists ls= new Lists();
		ls.arrayLists();ls.linkedlists();
		ls.setMethod();
		
		
	}

}

class Lists 
{
	public void arrayLists()
	{
		try
		{
			char[] str1 = new char[1];
			str1[0] = 'f';
			System.out.println("Char : " + str1[0]+ str1.length );

		}
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		String[] str2 = {"maths","physics","chemistry"}; 
		List<String> ls1 = Arrays.asList(str2);
		List<String> ls2 = new ArrayList<String>();
		ls2.add("ETV");ls2.add("gemini");ls2.add("Mtv");
		//al=Arrays.asList(str1);
		System.out.println(ls2);
		System.out.println(ls1);
	}
	public void linkedlists()
	{
		String[] s1 = {"KL","JB","MLK","PNG"};
		List<String> lst= Arrays.asList(s1);
		 Iterator<String> itr=lst.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(":->" +itr.next());
		 }
	}
	public void vector()
	{

	}
	//Set not allows duplicates
	public void setMethod()
	{
		
		String[] str = {"dell","hp","lenovo","","sony"};
		System.out.println("Length of String array is : " + str.length);
		HashSet<String> s	= new HashSet<String>(Arrays.asList(str));
		Iterator<String> itr1 = s.iterator();
		while(itr1.hasNext())
		{
			System.out.println(":->" + itr1.next());
		}
		//return itr1.next();
	}
	
}
