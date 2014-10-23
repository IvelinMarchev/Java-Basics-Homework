import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] words =  scanner.nextLine().toLowerCase().split("\\W+");
        TreeMap<String, Integer> wordOccurr = new TreeMap<>();
        
        int mostFreq = 0;
        for (String word : words) {
            if(wordOccurr.containsKey(word)) {
            	wordOccurr.put(word, wordOccurr.get(word) + 1);
            }
            else
            	wordOccurr.put(word, 1);
        }
        
        for (Map.Entry<String, Integer> word : wordOccurr.entrySet()) {
        	if (mostFreq < word.getValue()) {
        		
                mostFreq = word.getValue();
           	}
		}
        for (Map.Entry<String, Integer> word : wordOccurr.entrySet()) {
        	if (mostFreq == word.getValue()) {
        		System.out.println(word.getKey() + " -> " + word.getValue());
        	}
		}
	}

}
