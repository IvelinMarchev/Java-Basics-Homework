import java.util.Locale;
import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("US"));
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
			
		String hex = Integer.toHexString(a).toUpperCase();
		int binary = Integer.parseInt(Integer.toBinaryString(a));
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hex, binary, b, c);

	}

}
