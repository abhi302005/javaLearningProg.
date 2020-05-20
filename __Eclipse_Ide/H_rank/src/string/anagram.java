package string;

import java.util.Scanner;
import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
//		 creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		taking the input
		System.out.println("enter the first string");
		String str_1 = input.nextLine();
		System.out.println("enter the Second string");
		String str_2 = input.nextLine();
		
		
		int a[] = new int[256];
		int b[] = new int [256];
		
		for(char index: str_1.toCharArray()) {
			int count = (int) index;
			a[count]++;			
		}
		
		for(char index: str_2.toCharArray()) {
			int count = (int) index;
			b[count]++;
		}
		
		int index=0;
		for ( index =0; index < a.length; index++) {
			if(a[index]!=b[index]) {
//				System.out.println("not an anagram");
				System.out.println("not an anagram");
				break;
			}
		}
		if(index== a.length) {
			System.out.println("an anagram");
		}
		
		
		
	}

}
