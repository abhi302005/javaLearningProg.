package pattern;

public class L_triangleTop{
  public static void main(String[] args) {
	  int index;
	  int space;
	  int star;
	  int i=1;
	  int N = 5;
	  for (index = 1; index <= N; index++) {
		  for(star = 1; star <= (N-index);star++) {
			  System.out.print(" ");
		  }
		  for(space= 1;space<index;space++) {
			  System.out.print(i+"  ");
			  i++;
		  }
		  System.out.println();
	  }
       }

  }


