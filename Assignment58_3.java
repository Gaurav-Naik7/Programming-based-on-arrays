// Program to accept two arrays from user and copy the contnts of that array in another array in reverse order and return new array

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
		
		int[] arrret=new int[Arr1.length+Arr2.length];
		
		MyArray mobj=new MyArray();
		arrret=mobj.CopyArrayRev(Arr1,Arr2);
		
		for(i=0;i<arrret.length;i++)
		{
			System.out.print(arrret[i]+" ");
		}
		System.out.println();
	}
}

class MyArray
{
	public int[] CopyArrayRev(int arr1[],int arr2[])
	{
		int[] Arrc=new int[arr1.length+arr2.length];
		int i=0,x=0;
		
		for(i=0,x=arr2.length-1;i<arr2.length;i++)
		{
			Arrc[i]=arr2[x];
			x--;
		}
		
		for(i=0,x=arr1.length-1;i<arr1.length;i++)
		{
			Arrc[i+arr2.length]=arr1[x];
			x--;
		}
		
		return Arrc;
	
	}
}
