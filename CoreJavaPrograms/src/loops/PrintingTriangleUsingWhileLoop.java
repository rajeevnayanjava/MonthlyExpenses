package loops;

public class PrintingTriangleUsingWhileLoop {

	public static void main(String[] args) {
		int i=0;
		
		while(i<5){
			int j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
