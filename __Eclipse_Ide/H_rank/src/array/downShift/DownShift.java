package array.downShift;

import java.util.Scanner;

public class DownShift {

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
		
		int position = (array.length-1);
		int temp = array[position];
		for(int indexOuter =position; indexOuter >=0; ) {
			
//			=> swapping
			for (int indexInner = indexOuter-1; indexInner >= 0; indexInner-- ) {

				array[indexOuter] = array[indexInner];
				indexOuter--;
			}
			array[0]= temp;
			
			break;
			
		}
		System.out.println("after down-Shift");
		for(int index= 0; index < (array.length); index++) {
			System.out.println((index+1)+" -> "+ array[index]);
			
		}

	}

}
