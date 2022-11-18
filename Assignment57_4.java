// Program to accept two arrays from user and form new array which is combination of first and second array

import java.io.*;
import java.util.*;
import java.util.Arrays;

class Assignment57_4
{
	public static void main(String arg[])
	{
		int i=0,j=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in first array: ");
		int ilength1=sobj.nextInt();
		
		System.out.println("Enter the number of elements in second array: ");
		int ilength2=sobj.nextInt();
		
		int[] Arr1=new int[ilength1];
		int[] Arr2=new int[ilength2];
		
		System.out.println("Enter the elements in first Array");
		for(i=0;i<Arr1.length;i++)
		{
			Arr1[i]=sobj.nextInt();
		}
		System.out.println("Enter the elements in second Array");
		for(i=0;i<Arr2.length;i++)
		{
			Arr2[i]=sobj.nextInt();
		}

		MyArray mobj=new MyArray();
		mobj.Display(Arr1,Arr2);
	}
}

class MyArray
{
	public void Display(int arr1[],int arr2[])
	{
		int[] Arrc=new int[arr1.length+arr2.length];
		int i=0;
		
		for(i=0;i<arr1.length;i++)
		{
			Arrc[i]=arr1[i];
		}
		
		for(i=0;i<arr2.length;i++)
		{
			Arrc[arr1.length+i]=arr2[i];
		}
		
		System.out.println("Combination of contents of first and second array: ");
		
		for(i=0;i<Arrc.length;i++)
		{
			System.out.print(Arrc[i]+" ");
		}
		System.out.println();
	
	}
}
