import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] intArray = new int[n];
		for(int i = 0; i< intArray.length;i++){
			intArray[i] = in.nextInt();
		}
		
		Arrays.sort(intArray);
		for (int i : intArray) {
			System.out.println(i);
		}
	}

}
