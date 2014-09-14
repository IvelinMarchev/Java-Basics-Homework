import java.util.Scanner;

public class _06_SumTwoNumbers {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int numberOne = Integer.parseInt(sc.nextLine());
		int numberTwo = Integer.parseInt(sc.nextLine());
		
		sc.close();
		System.out.println(numberOne +  numberTwo);
	}

}