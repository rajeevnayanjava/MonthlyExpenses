package loops;

public class PrintingTriangleUsingDoWlileLoop {

	public static void main(String[] args) {
		int i=0;
		do{
			if(i!=0)
			System.out.println();
			int j=0;
			do{
				System.out.print("*");
				j++;
			}
			while(j<=i);
			i++;
		}
		while(i<5);

	}

}
