package pattern;
import java.util.Scanner;
public class Mid_space {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N= input.nextInt();
		for(int index =1; index<=N; index++) {
			if(index == 1 || index == N) {
				for(int star = 1; star<= index; star++) {
					System.out.print("* ");
				}
			}else {
				System.out.print("* ");
				for(int space = 1; space <= index-2; space++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
