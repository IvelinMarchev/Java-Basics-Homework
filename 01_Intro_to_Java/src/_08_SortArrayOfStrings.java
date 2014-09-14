import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String[] strArray = new String[n];
		for(int i = 0; i< strArray.length;i++){
			strArray[i] = in.next();
		}
		
		Arrays.sort(strArray);
		for (String string : strArray) {
			System.out.println(string);
		}	
	}
}
