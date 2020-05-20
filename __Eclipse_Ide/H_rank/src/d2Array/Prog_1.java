package d2Array;
import java.util.Scanner;

public class Prog_1 {

	public static void main(String[] args) {
//		=> creating the Scanner object.
		Scanner input = new Scanner(System.in);
		
		System.out.println("=> taking the INPUT");
		System.out.println("Enter the number of Rows");
		final int R_SIZE = input.nextInt();
		System.out.println("Enter the number of Columns for each Row");
		final int C_SIZE = input.nextInt();
		
//		=> creating 2D array
		int [][] studentMarks = new int [R_SIZE][C_SIZE];
		int count =0;
		
//		=> taking the data form the user
		for( int R_index=0; R_index < R_SIZE; R_index++) {
			System.out.println("enter the data for row:\t"+R_index);
			for(int C_index = 0; C_index < C_SIZE; C_index++) {
				System.out.print(count+" -> ");
				studentMarks[R_index][C_index] = input.nextInt();
				count++;
			}
			count =0;
			System.out.println();
		}
		
		
//		=> printing the data
		System.out.println("=> DISPLAY the output");
		for( int R_index=0; R_index < R_SIZE; R_index++) {
			System.out.println("data of row:\t"+R_index);
			for(int C_index = 0; C_index < C_SIZE; C_index++) {
				System.out.println(count+" -> "+ studentMarks[R_index][C_index] );
				count++;
			}
			count =0;
			System.out.println();
		}
		
//		=> updating the data.
		System.out.println("enter the Row of which element you wnt to update");
		int R_position = input.nextInt();
		int C_position;
		if(R_position <= R_SIZE) {
			System.out.println("enter the Position of element");
			C_position = input.nextInt();
			if(C_position <= C_SIZE ) {
				System.out.println("Enter the element:");
				int element =input.nextInt();
				studentMarks[R_position][C_position] = element;
			} else System.out.println("incorrect position");
		}else System.out.println("data not found");
		
//		=> printing the updated list.
		System.out.println("=> DISPLAY the output");
		for( int R_index=0; R_index < R_SIZE; R_index++) {
			System.out.println("data of row:\t"+R_index);
			for(int C_index = 0; C_index < C_SIZE; C_index++) {
				System.out.println(count+" -> "+ studentMarks[R_index][C_index] );
				count++;
			}
			count =0;
			System.out.println();
		}
		
//		=> deletion of an element
		System.out.println("Enter the Row of which element you want to delete");
		R_position = input.nextInt();
		if(R_position <= R_SIZE) {
			System.out.println("enter the Position of element");
			C_position = input.nextInt();
			if(C_position <= C_SIZE ) {
//				=> code here
				for(int C_indexOuter =C_position; C_indexOuter < C_SIZE; ) {
					
//					=> swapping
					for (int C_indexInner = C_indexOuter+1; C_indexInner < C_SIZE; C_indexInner++ ) {
						studentMarks[R_position][C_indexOuter] = studentMarks[R_position][C_indexInner];
						C_indexOuter++;
					}
					studentMarks[R_position][C_SIZE-1]= 0;
					break;
					
				}
			}
			else System.out.println("incorrect position");
		}else System.out.println("data not found");
		
//		=> printing the updated list.
		System.out.println("=> DISPLAY the output");
		for( int R_index=0; R_index < R_SIZE; R_index++) {
			System.out.println("data of row:\t"+R_index);
			for(int C_index = 0; C_index < C_SIZE; C_index++) {
				System.out.println(count+" -> "+ studentMarks[R_index][C_index] );
				count++;
			}
			count =0;
			System.out.println();
		}
		
	}//end of main()

}// end of Prog_1 class
