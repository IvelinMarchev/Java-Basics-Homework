import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double xA = input.nextDouble();
		double yA = input.nextDouble();
		
		double xB = input.nextDouble();
		double yB = input.nextDouble();
		
		double xC = input.nextDouble();
		double yC = input.nextDouble();
		
		double area = Math.abs((xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2);
		System.out.println((int)area);
	}

}
