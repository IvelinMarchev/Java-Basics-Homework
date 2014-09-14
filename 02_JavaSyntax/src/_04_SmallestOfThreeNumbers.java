import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class _04_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double a = Double.parseDouble(input.nextLine());
		double b = Double.parseDouble(input.nextLine());
		double c = Double.parseDouble(input.nextLine()); 
		double smallest = Math.min(a, Math.min(b, c));
		DecimalFormat df = new DecimalFormat("###.#");
		
		System.out.println(df.format(smallest));
		
	}

}
