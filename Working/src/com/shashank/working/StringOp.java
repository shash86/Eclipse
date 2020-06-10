package com.shashank.working;

import java.util.Scanner;

public class StringOp {

	public static void main(String[] args) {
		
    String s1,s2;

    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the strings");
    
    s1=sc.nextLine();
    s2=sc.nextLine();
    
    String s3=s1.concat(s2);
    
    System.out.println("Concatenated string is : " +s3);
    
    
    int k=s1.length();
    int j=s2.length();
    
    System.out.println("Length of s1 =" +k);
    System.out.println("Length of s2 =" +j);
    
    s1=s3.toUpperCase();
    
    System.out.println("caps of s1="+s1);
    
    sc.close();
	}

}
