package arraySorting;
import java.util.Scanner;


public class Bubble_String {

	public static void main(String[] args) {
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the total number of element you want to insert");
		final int SIZE = input.nextInt();
		String [] array = new String [SIZE];
		
//		=> taking the input
		{
			int count = 0;
		System.out.println("Enter the elements");
		for(int index = 0; index < array.length; index++) {
			input.nextLine();
//			System.out.println();
			System.out.print(count+" => ");
//			System.out.println();
			array[index] = input.nextLine();
			
			count++;
		}
		}
		
		{
			String valueHolder;
			for(int phase =0; phase < array.length; phase++) {
				int flag =0;
				for(int index =0; index < array.length-1;index++) {
					if(array[index].compareTo(array[index+1]) >0) {
//						=> swapping
						valueHolder = array[index];
						array[index] = array[index+1];
						array[index+1]= valueHolder;
						flag =1;
//						flag-=9;
					}
					
				}
				if(flag ==0) {
					System.out.println("break");
					break;
					
				}
			}
		}
		
		{
//			=> printing the Sorted data
			int count = 0;
			System.out.println("=> sorted list");
			for(int index = 0; index < array.length; index++) {
				System.out.println(count+" => "+array[index] );
				count++;
			}
		}
	}// end of main();

}// end of Bubble_String class
