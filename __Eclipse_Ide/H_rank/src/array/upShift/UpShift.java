package array.upShift;

import java.util.Scanner;

public class UpShift {

	public static void main(String[] args) {
//		creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		taking the input
		System.out.println("Enter the Size of array");
		final int SIZE = input.nextInt();
		int [] array = new int [SIZE];
		
		for(int index =0 ; index < array.length; index++) {
			System.out.print((index+1)+" =>");
			array[index] = input.nextInt();
		}
		
		int position = 0;
		int temp = array[0];
		for(int indexOuter =position; indexOuter < array.length; ) {
			
//			=> swapping
			for (int indexInner = indexOuter+1; indexInner < array.length; indexInner++ ) {
				array[indexOuter] = array[indexInner];
				indexOuter++;
			}
			array[(array.length-1)]= temp;
			
			break;
			
		}
		System.out.println("after up-Shift");
		for(int index= 0; index < (array.length); index++) {
			System.out.println((index+1)+" -> "+ array[index]);
			
		}

	}

}
