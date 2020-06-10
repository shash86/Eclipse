package com.shashank.working;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffRedr {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("enter the numb");
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		int n=Integer.parseInt(br.readLine());
		
		System.out.println(n);
		
		System.out.println("im shashank");
		
		

	}

}
