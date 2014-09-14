import java.util.Scanner;

public class _02_GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] text = input.next().toCharArray();
		for (int i = 0; i < text.length; i++) {
			for (int j = 0; j < text.length; j++) {
				for (int k = 0; k < text.length; k++) {
					System.out.printf("%c%c%c " ,text[i], text[j], text[k]);
				}
			}
		}
	}
}
