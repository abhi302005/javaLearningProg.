package array;
import java.util.Scanner;

public class Prog_1 {

	public static void main(String[] args) {
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students.");
		int n = input.nextInt();
		
//		=> declaring the constant of Int type
		final int Size = n;
		
//		=> declaring the array 
		int [] studentsMarks = new int [Size];
		
		System.out.println("Enter the marks");
		int count = 1;
		for(int index = 0; index < studentsMarks.length; index++) {
			
			System.out.print("student "+ count +" ->");
			studentsMarks[index] = input.nextInt();
			count++;
		}
		
		System.out.println();
		
		float avgMarks=0f;
		
//		=> calculation of avg. marks
		for(int index = 0; index < studentsMarks.length; index++ ) {
			avgMarks += studentsMarks[index];
		}
		
//		=> printing the final result.
		System.out.println("the avg. marks of all student is:\t"+ (avgMarks/studentsMarks.length));
		
//		=> updating the element from the array.
		System.out.println("enter the number of student whom marks you want to change:");
		int position = input.nextInt();
		position--;
		
		if (position < studentsMarks.length) {
			System.out.println("Enter the marks");
			studentsMarks[position] = input.nextInt();
		}else System.out.println("the rollNO is incorrect");

//		=> updated element
		count =1;
		for(int index = 0; index < studentsMarks.length; index++) {
		System.out.println(count + " -> "+studentsMarks[index]);
		count++;
		}
		
//		=> deleting the element form the array
		
		position =0;
		
		System.out.println("enter the rollNO");
		position = input.nextInt();
		position--;
		System.out.println("pos:\t"+ position);
		if(position < studentsMarks.length) {
			
			for(int indexOuter =position; indexOuter < studentsMarks.length; ) {
				
//				=> swapping
				for (int indexInner = indexOuter+1; indexInner < studentsMarks.length; indexInner++ ) {
					studentsMarks[indexOuter] = studentsMarks[indexInner];
					indexOuter++;
				}
				studentsMarks[(studentsMarks.length-1)]= 0;
				break;
				
			}
		}else System.out.println("rollNO incorrect");
		count = 1;
		for(int index= 0; index < studentsMarks.length; index++) {
			System.out.println(count+" -> "+ studentsMarks[index]);
			count++;
		}
	}

}
