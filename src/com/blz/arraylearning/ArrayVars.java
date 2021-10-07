package com.blz.arraylearning;

public class ArrayVars {
   public static void main(String[] args) {
   System.out.println(addNumbers(10,20));
   System.out.println(addNumbers(10,20,30));
   System.out.println(addNumbers(10,20,30,40));
   System.out.println(addNumbers(10,20,30,40,50));
   System.out.println(addNumbers(10,20,30,40,50,60));
   System.out.println(addNumbers(10,20,30,40,50,60,70));
   
   
   }

private static  long addNumbers(int...i) {
//	long result = 0;
//	int limit = i.length - 1;
//	while(0 <= limit) {
//		result = result + i[limit];
//		limit--;
	
     long result = 0;
     int limit = i.length;
     int m =0;
     while(m < limit) {
    	 result = result + i[m];
    	 m++;
     }
	  return result;
  }



}
