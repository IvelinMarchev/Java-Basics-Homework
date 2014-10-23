import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().split("\\W+");
		TreeSet<String> orderedWords = new TreeSet<>();
		
		for (int i = 0; i < words.length; i++) {
			orderedWords.add(words[i].toLowerCase());
		}
		
		for (String word : orderedWords) {
			System.out.print(word + " ");
		}
		
	}
}
