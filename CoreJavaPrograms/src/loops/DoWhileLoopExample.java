package loops;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		// Print table of 5
		int i=1;
		//int i=11; //If condition is false then also do part will execute once
		do{
			System.out.println(i+" * "+ "5 = "+i*5);
			i++;
		}
		while(i<=10);

	}

}
