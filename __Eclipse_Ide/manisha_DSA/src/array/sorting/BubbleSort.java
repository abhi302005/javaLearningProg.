package array.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of N");
		final int N = input.nextInt();
		
		int array[] = new int [N];
		
		System.out.println("Enter the element in array");
		for(int index = 0; index< array.length; index++) {
			array[index] = input.nextInt();
		}
		
//		bubble sort
		
		for(int index_i =0; index_i < array.length; index_i++) {
			int valueHolder;
			for(int index_j = 0; index_j < (array.length-1); index_j++){
				if(array[index_j]>array[index_j+1]) {
					
					valueHolder = array[index_j];
					array[index_j]= array[index_j+1];
					array[index_j+1]= valueHolder;
					
				}
			}
			
//			showing the intermediate result
			System.out.println("phase"+(index_i+1));
			System.out.println("sorted array");
			for(int index: array) {
				System.out.println(index);
			}
			System.out.println();
			
		}
		
		
		System.out.println("sorted array");
		for(int index: array) {
			System.out.println(index);
		}
		

	}//end of main

}// end of class