package ch_1;
import java.util.Scanner;
public class prog_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		taking input 
		System.out.println("Enter the value");
		 long N = sc.nextLong();
		 while(true) {
			 System.out.println("N "+N);
			 if(N==1) break;
			 if(N%2 ==0) N /= 2;
			 else N = (N*3)+1;
		 }
//		 System.out.println("N "+ N);
		

	}

}
