/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n=100,m=1500,a,c,count=0,temp,i;
	  for(i=n;i<m;i++)
	  {
	  	temp=i;
	  	c=0;
	  	while(temp!=0)
	  	{
	  		a=temp%10;
	  		temp=temp/10;
	  		c=c+(a*a*a);
	  	}
	  	if(i==c)
	  	{
	  		System.out.print(i+" ");
	  		count++;
	  	}
	  }
	  		if(count==0)
	  		{
	  			System.out.print("Not Armstrong");
	  		}
	  	}
	  }
	
