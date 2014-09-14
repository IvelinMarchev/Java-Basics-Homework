import java.util.Scanner;

public class _07_CountBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.print(Integer.toBinaryString(n));
		System.out.println("\nCount of bits one: " + Integer.bitCount(n));
	}

}
