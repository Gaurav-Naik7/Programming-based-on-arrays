// Program to accept two arrays from user and display event contents of each array

import java.io.*;
import java.util.*;

class Assignment57_2
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
		mobj.DisplayEven(Arr1,Arr2);
	}
}

class MyArray
{
	public void DisplayEven(int arr1[],int arr2[])
	{
		int i=0;
		
		System.out.println("Elements in first Array: ");
		for(i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println("Elements in second Array");
		for(i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
			{
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println();

	}
}
