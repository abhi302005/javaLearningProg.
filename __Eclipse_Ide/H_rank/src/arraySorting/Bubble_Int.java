package arraySorting;
import java.util.Scanner;

public class Bubble_Int {
	public static void main(String[] args) {
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total number of element you want to insert");
		final int SIZE = input.nextInt();
		int [] array = new int [SIZE];
		
		
		
//		=> taking the input
		{
			int count = 0;
		System.out.println("Enter the elements");
		for(int index = 0; index < array.length; index++) {
			System.out.print(count+" => ");
			array[index] = input.nextInt();
			count++;
		}
		}
		
//		=> sorting the input by using the "Bubble sort algo."
		
		{
			int valueHolder;
//			int count =1;
			for(int phase =0; phase < array.length; phase++) {
				int flag =0;
				for(int index =0; index < array.length-1;index++) {
					if(array[index] > array[index+1]) {
//						=> swapping
						System.out.println("=> intermediate results");
						System.out.println("index: "+index+">"+(index+1));
						System.out.println("value's: "+array[index]+">"+array[index+1]);
						valueHolder = array[index];
						array[index] = array[index+1];
						array[index+1]= valueHolder;
						flag =1;
						
//						flag-=9;
						
						int count =0;
						for(int index_ = 0; index_ < array.length; index_++) {
							
							System.out.println(phase+"."+count+" => "+array[index_] );
//							= input.nextInt();
							count++;
						}
						
						

						
					}// end of if
					else System.out.println("\t********************COndition passed*******************");
					
				}// end of inner for loop
				
				
				if(flag ==0) {
					System.out.println("		break");
					break;
					
				}else	System.out.println("\tnothing happen\t=>"+ flag);
				
			}// end of outer for loop
		}
		
		
		{
//			=> printing the Sorted data
			int count = 0;
			System.out.println("=> sorted list");
			for(int index = 0; index < array.length; index++) {
				System.out.println(count+" => "+array[index] );
//				= input.nextInt();
				count++;
			}
		}
		
		
		
		
	
}//end of main();
	
}//end of Bubble_Int class
