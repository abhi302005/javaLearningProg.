package ch_1;
import java.util.*;
public class prog_2 {

	public static void main(String[] args) {
//	=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		long a;
		long b;
		int mod;
		boolean flag = false;
		System.out.println("enter the mod value");
		mod= input.nextInt();
		System.out.println("enter the 1st value");
		a= input.nextLong();
		System.out.println("enter the 2nd value");
		b= input.nextLong();

		float r1 = ((a+b)%mod );
		System.out.println(r1);
		float r2 = ( a%mod + b%mod )%mod; 
		System.out.println(r2);
//		if(  r1 == r2 ) flag = true;
		System.out.println(flag);
	}

}
