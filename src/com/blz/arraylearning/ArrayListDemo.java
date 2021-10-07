package com.blz.arraylearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
 public static void main(String[] args) {
	 System.out.println("-------------ArrayList--------");
	 List<String> birds = new ArrayList<>();
	        birds.add(0, "duck");
	        birds.add(1, "parrot");
	        System.out.println(birds.get(0));
	        birds.add(2, "pigeon");
	        birds.add(3 ,"dove");
	        System.out.println(birds.get(2));
	        System.out.println(birds.get(3));
	        System.out.println(birds.get(1));
	        birds.set(0, "sparrow");
	        System.out.println(birds.get(0));
	        birds.set(1,"lion");
	        System.out.println(birds.get(1));
	      
            System.out.println("-----------------------"); 
            
	        List<String> birds1 = new ArrayList<>(Arrays.asList("pigeon", "dove", "duck", "parrot"));
            for(int i=0; i< birds1.size();i++)
	        System.out.println(birds1.get(i));
            birds1.set(3, "peacock");
            System.out.println(birds1.get(3));
             
            System.out.println("-----Arrays------------------");  
             
            String[] birds2 = new String[5];    
            birds2[0] = "pigeon";
            birds2[1] = "duck";
            birds2[2] = "parrot";
            birds2[3] = "peacock";
            birds2[4] = "dove";
            
            System.out.println(birds2[1]);
            System.out.println("-----------------------"); 
            
            for(int i=0; i<birds2.length; i++)
            {
            	System.out.println(birds2[i]);
            }
          
          
          
            
 }

}
