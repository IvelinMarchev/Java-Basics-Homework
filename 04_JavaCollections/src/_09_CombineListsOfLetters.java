import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
            ArrayList<Character> list = new ArrayList<>();
            ArrayList<Character> combinedList = new ArrayList<>();
            
            // read chars from first list;
            // with "replaceAll" method remove all whitespace
            for (char c : scanner.nextLine().replaceAll("\\s+", "").toCharArray()) {
                    list.add(c);
            }
            combinedList.addAll(list);
            // add chars from second list to combined one,
            // but only those chars, which do not exist in first list
            for (char c : scanner.nextLine().replaceAll("\\s+", "").toCharArray()) {
                    if (!list.contains(c)) {
                            combinedList.add(c);
                    }
                    // there's no need to save these chars
            }
            for (char c : combinedList) {
                    System.out.print(c + " ");
            }
	}

}
