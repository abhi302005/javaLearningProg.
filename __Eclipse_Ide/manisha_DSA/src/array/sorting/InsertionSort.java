package array.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
//		=> creating Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of N");
		final int N = input.nextInt();
		
		int array[] = new int [N];
		
		System.out.println("Enter the element in array");
		for(int index = 0; index< array.length; index++) {
			array[index] = input.nextInt();
		}

//		=> Insertion Sort
		int key = 1;
		int count=1;
		while(key< array.length) {
			int valueHolder;
			for(int index_i = 0 ; index_i < key; index_i++) {
				if(array[key]<array[index_i]) {
					valueHolder = array[key];
					array[key]= array[index_i];
					array[index_i] = valueHolder;
				}
			}
//			showing the intermediate result
			System.out.println("phase"+(count++));
			System.out.println("sorted array");
			for(int index: array) {
				System.out.println(index);
			}
			System.out.println();
			
			
			key++;
		}
		
		System.out.println("sorted array");
		for(int index: array) {
			System.out.println(index);
		}

	}

}
