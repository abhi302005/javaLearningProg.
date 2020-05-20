package forLoop;

public class tableTill_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastTable = 20;
		int index_1;
		int index_2;
		for(index_1 = 1; index_1<=20; index_1++) {
			System.out.print(" "+index_1+"=>");
			
			for(index_2 = 1 ; index_2 <=10 ; index_2++) {
				
				System.out.print(" "+index_1*index_2);
				
			}
			System.out.println();
			
		}
		

	}

}
