package arraySorting;
import java.util.Scanner;

public class Selection_int {

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
			for(int phase=0; phase < array.length;phase++) {
				for(int index=phase+1; index < array.length; index++ ) {
					if(array[index]<array[phase]) {
						
						System.out.println("phase: "+phase);
						System.out.println("index: "+ index+" < "+(phase));
						System.out.println("value: "+array[index]+" < "+array[phase]);
						
						
						
						valueHolder = array[index];
						array[index]= array[phase];
						array[phase]= valueHolder;
						{
							int count=0;
							for(int index_ =0 ;index_ < array.length; index_++) {
								System.out.println(count+" => "+array[index_]);
								count++;
							}
						}
						
						System.out.println();
					}
					
				}
			}
		}// end of sorting block
		
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
