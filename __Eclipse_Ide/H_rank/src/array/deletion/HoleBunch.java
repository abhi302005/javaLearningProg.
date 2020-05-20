package array.deletion;

import java.util.Scanner;

public class HoleBunch {

	public static void main(String[] args) {
//		creating Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		final int SIZE = input.nextInt();
		
		int [] value = new int[SIZE];
		
//		taking the input
		for(int index=0; index < value.length; index++) {
//			System.out.print(index +" =>");
			value[index] =  input.nextInt();
		}
		
		int [] FalseIndex = new int[value.length];
		int count =0;
		for(int index= 0; index < value.length; index++) {
			for(int i =index+1; i < value.length-1; i++) {
				if(value[index]==(value[i])) {
					FalseIndex[count] = i;
					count++;
				}
//				else {
//					FalseIndex[i] = 000;
////					count++;
//				}
			}
		}
		final int C= value.length-count;
		System.out.println("C "+C);
		int [] finalO = new int[C];
		int t=0;
		for(int index =0; index< value.length; index++) {
			int flag =0;
			for(int i=0; i< value.length; i++ ) {
				if(index != 0 && index == FalseIndex[i]) {
					flag =1;
					break;
				}
			}
			if(flag==0 && t<C) {
				finalO[t] = value[index];
				t++;
			}
		}
		
//		=> sorting through bubble sort
		{
			int valueHolder;
			for(int phase =0; phase < finalO.length; phase++) {
				int flag =0;
				for(int index =0; index < finalO.length-1;index++) {
					if(finalO[index]>(finalO[index+1])) {
//						=> swapping
						valueHolder = finalO[index];
						finalO[index] = finalO[index+1];
						finalO[index+1]= valueHolder;
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
		
//		printing 
		System.out.println("final output");
		System.out.println("total no of element: "+C);
		System.out.println("total no of dublicate element: "+count);
		
		
		for(int v: finalO) {
			
			System.out.println(v);
		}

		

	}

}
