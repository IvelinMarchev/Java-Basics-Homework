
import java.util.Scanner;

public class _01_RectangleArea {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int rectangleArea = a * b;
		System.out.println(rectangleArea);
		
	}
}
