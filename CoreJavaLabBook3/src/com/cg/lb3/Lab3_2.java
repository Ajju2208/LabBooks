package com.cg.lb3;

import java.util.Scanner;

public class Lab3_2 {

   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String a = sc.nextLine();
	   String b[] = a.split(" ");
	   int x = b.length;
	   String ans = "";
	   for(int i = 0;i<x;i++) {
		   ans+=b[i];
	   }
	   System.out.println(ans.length());
   }   
}
