package pattern;

public class mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int index_1 =1; index_1 <=5; index_1++) {
			for(int index_2 =1; index_2 <= index_1; index_2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int index_1 = 4; index_1 >=1; index_1--) {
			for(int index_2 =1; index_2 <= index_1; index_2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
