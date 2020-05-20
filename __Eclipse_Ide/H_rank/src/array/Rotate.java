package array;
import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		
		
		int N = input.nextInt();
		int size =(int) (N/10);
		int[] arr = new int[size];
		int count =10;
		for(int index =0;index< arr.length; index++) {
			arr[index] = count;
			count +=10;
		}
		
		for(int index: arr) {
			System.out.println(index+" ");
		}
		System.out.println();
		
		for(int index = arr.length-1; index>= 0; index--) {
			System.out.println(arr[index]);
		}
	}

}
