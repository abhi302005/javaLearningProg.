package outputFormatting;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
//		=> creating the Scanner class object
		Scanner input = new Scanner(System.in);
		System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=input.next();
            int x=input.nextInt();
            
            System.out.printf("%-15s%03d%n",s1,x);
	}//end of forLoop
		System.out.println("================================");

        

}//end of main()
}
