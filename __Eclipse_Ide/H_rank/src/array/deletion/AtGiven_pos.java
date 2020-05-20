package array.deletion;

import java.util.Scanner;

public class AtGiven_pos {
	public static void main(String args[]) {

//	creating the Scanner object
	Scanner input = new Scanner(System.in);
	
//	taking the input
	System.out.println("Enter the Size of array");
	final int SIZE = input.nextInt();
	int [] array = new int [SIZE];
	
	for(int index =0 ; index < array.length; index++) {
		System.out.print((index+1)+" =>");
		array[index] = input.nextInt();
	}
	
	while(true) {
	System.out.println("Enter the Postion");
	int position = input.nextInt();
	if(position<array.length) {
	for(int indexOuter =position; indexOuter < array.length; ) {
		
//		=> swapping
		for (int indexInner = indexOuter+1; indexInner < array.length; indexInner++ ) {
			array[indexOuter] = array[indexInner];
			indexOuter++;
		}
		array[(array.length-1)]= 0;
		break;
		
	}
	break;
	}else continue;
	}
	
	for(int index= 0; index < (array.length-1); index++) {
		System.out.println((index+1)+" -> "+ array[index]);
		
	}
}
}
