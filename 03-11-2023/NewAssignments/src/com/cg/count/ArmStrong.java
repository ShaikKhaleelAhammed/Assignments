package com.cg.count;

import java.util.Scanner;

public class ArmStrong {
	
	   public static void main(String[] args)
	   {
	      int num, temp, totalDigit=0, res=0, rem, pow, i;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Number: ");
	      num = scan.nextInt();
	      
	      temp = num;
	      while(num>0)
	      {
	         num = num/10;
	         totalDigit++;
	      }
	      
	      num = temp;
	      while(num>0)
	      {
	         rem = num%10;
	         pow = 1;
	         i = 0;
	         while(i<totalDigit)
	         {
	            pow = pow*rem;
	            i++;
	         }
	         res = res + pow;
	         num = num/10;
	      }
	      
	      if(res==temp)
	         System.out.println("\nArmstrong Number");
	      else
	         System.out.println("\nNot an Armstrong Number.");
	   }
	}


