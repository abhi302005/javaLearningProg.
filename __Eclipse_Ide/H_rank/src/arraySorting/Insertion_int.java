package arraySorting;

import java.util.Scanner;

public class Insertion_int {

	public static void main(String[] args) {
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Size of array");
		final int SIZE = input.nextInt();
		
//		=> creating array
		int [] array = new int [SIZE];
		
//		=> taking the input
		{
			int count =0;
		for(int index = 0; index < array.length; index++) {
			System.out.print(count+" => ");
			array[index] = input.nextInt();
			count++;
		}
		}// end of input block
		
//		=> sorting
		{
			int valueHolder;
		for(int phase= 0; phase< array.length-1; phase++) {
			int key = phase+1;
			int index =0;
			while(index < key) {
				if(array[key]<array[index]) {
//					=> swap
					System.out.println("phase: "+phase);
					System.out.println("index: "+ key+" < "+(index));
					System.out.println("value: "+array[key]+" < "+array[index]);
					
					valueHolder = array[index];
					array[index] = array[key];
					array[key] = valueHolder;
					
					{
						int count=0;
						for(int index_ =0 ;index_ < array.length; index_++) {
							System.out.println(count+" => "+array[index_]);
							count++;
						}
					}
					
					System.out.println();
					
				}
				index++;
			}
				
			}
		} // end of sorting block
		
//		=> printing the sorted list
		{
			int count=0;
			for(int index =0 ;index< array.length; index++) {
				System.out.println(count+" => "+array[index]);
				count++;
			}
		}

	}

}
