import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String integersString = scanner.nextLine();
		String[] numbers = integersString.split(" ");
		
		ArrayList<String> increasingSequence = new ArrayList<String>();
		ArrayList<String> currentSequence = new ArrayList<String>();
		
		increasingSequence.add(numbers[0]);
		currentSequence.add(numbers[0]);
		System.out.printf("%s ", numbers[0]);
		
		for (int i = 1; i < numbers.length; i++) {
				int currentNum = Integer.parseInt(numbers[i]);
				int prevNum = Integer.parseInt(numbers[i - 1]);
				
				if (currentNum <= prevNum) {
					
					currentSequence.clear(); 
					System.out.println();
				}
				
				currentSequence.add(numbers[i]);
				System.out.printf("%s ", numbers[i]);
				
				if (currentSequence.size() > increasingSequence.size()) {
					
					increasingSequence = new ArrayList<String>(currentSequence);		
				}
		}
		
		System.out.printf("\nLongest: ");
		for (String s : increasingSequence) {
			
			System.out.printf("%s ", s);
		}
	}

}
