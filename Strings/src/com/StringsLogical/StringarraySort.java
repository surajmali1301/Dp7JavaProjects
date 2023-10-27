package com.StringsLogical;

import java.util.Arrays;

public class StringarraySort {
	
	static void sortLexo(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].compareTo(st[j])>0)
				{
					String temp= st[i];
					st[i]=st[j];
					st[j]= temp;
				}
			}
		}
		
	}
	
	static void sortLength(String st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].length()>st[j].length())
				{
					String temp= st[i];
					st[i]=st[j];
					st[j]= temp;
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str[]= {"Java","C","Angular","Python","C++"};
		
		// lexicographically
		
		System.out.println("Before Sort:"+Arrays.toString(str));
		
		sortLexo(str);
		
		System.out.println("After sort Lexographically:\n"+Arrays.toString(str));
		
		sortLength(str);
		
		System.out.println("After sort length:"+Arrays.toString(str));
		
		
		
	}

}
