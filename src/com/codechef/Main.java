package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Deletion of an element in an array:
   Scanner sc = new Scanner(System.in);
   int size,del_ele;
   size = sc.nextInt();
   del_ele = sc.nextInt();
   int[] arr = new int[size];
   for(int i=0;i<size;i++){
       arr[i] = sc.nextInt();
   }
   for(int j=0;j<size;j++){
       if(arr[j]==del_ele){
           for(int i=0;i<size-1;i++){
               arr[i] = arr[i+1];
           }
       }
       break;
   }
   for(int i=0;i<size-1;i++){
       System.out.println(arr[i]);
   }






    }
}
