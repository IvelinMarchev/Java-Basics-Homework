import java.util.Scanner;

public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int count = 0;
		
		String binary = Integer.toBinaryString(n);
		
		char[] arr = binary.toCharArray();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
