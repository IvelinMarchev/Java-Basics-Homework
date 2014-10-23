import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		String[] cards = scanner.nextLine().split("[♥♣♦♠ ]+");
		LinkedHashMap<String, Integer> cardsMap = new LinkedHashMap<>();
		
		for (String card : cards) {
			Integer count = cardsMap.get(card);
			
			if (count == null) {
				count = 0;
			}
			
			cardsMap.put(card, count + 1);
			
		}
		for (Map.Entry<String, Integer> entry : cardsMap.entrySet()) {
			
			System.out.printf(Locale.ENGLISH, "%s -> %.2f%%\n", entry.getKey(), 
												(double)entry.getValue() * 100 / cards.length);
		}
	}

}
