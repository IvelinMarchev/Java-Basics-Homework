import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suit = {'♣', '♦', '♥', '♠'};
		
		Random random = new Random();
		int hand = input.nextInt();
		
		for (int i = 0; i < hand; i++) {
			for (int j = 0; j < 5; j++) {
				
				int numberCard = random.nextInt(face.length);
				int numberSuit = random.nextInt(suit.length);
				
				System.out.printf("%s%c ",face[numberCard], suit[numberSuit]);
			}
			
			System.out.println();
		}
	}

}
