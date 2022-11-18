// Program to accept two arrays from user and return difference between summation of arrays

import java.io.*;
import java.util.*;

class Assignment58_1
{
	public static void main(String arg[])
	{
		int i=0,j=0;
		boolean bRet;
		
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
		bRet=mobj.ChkPallindrome(Arr1,Arr2);
		
		if(bRet==true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}	
	}
}

class MyArray
{
	public boolean chkpalindrome(int iNo)
	{
		while(iNo!=0)
		{
			
		}
	}
	
	public boolean ChkPallindrome(int arr1[],int arr2[])
	{		
		int[] Arrc=new int[arr1.length+arr2.length];
		int i=0;
		boolean bret=true;
		
		for(i=0;i<arr1.length;i++)
		{
			Arrc[i]=arr1[i];
		}
		
		for(i=0;i<arr2.length;i++)
		{
			Arrc[arr1.length+i]=arr2[i];
		}
		
		for(i=0;i<Arrc.length;i++)
		{
			if(chkpalindrome(Arrc[i])==false)
			{
				bret=false;
				break;
			}
		}
		
		
	}
}
