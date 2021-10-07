package com.blz.arraylearning;

import java.util.Scanner;

public class ArrayDemo1 {
	     static int row, column;
 private static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
	  
     System.out.println("enter row size :");
	  int row = sc.nextInt();
	  System.out.println("enter column size :");
	  int column = sc.nextInt();
  int intArray[][] = new int[row][column];
  int[][] Array1 = {{1, 2, 3}, {5, 7, 9}, {44, 66, 99}};
        System.out.println("enter" + row*column + "elements :");
       for(int i = 0; i < row; i++) {
    	   for (int j = 0; j < column; j++) {
               intArray[i][j] =sc.nextInt();
    	   }
       }
       System.out.print("The Array is :\n");
       for(int i=0; i<row; i++)
       {
           for(int j=0; j<column; j++)
           {
               System.out.print(intArray[i][j]+ " |  ");
           }
           System.out.println("");
           sc.close();
  
//           for(int i=0; i<3; i++)
//           {
//               for(int j=0; j<3; j++)
//               {
//            	   System.out.print(Array1[i][j]+ " |  ");
//               }
//               System.out.println("");
//               sc.close();
//           }
           
  }  

}
}
