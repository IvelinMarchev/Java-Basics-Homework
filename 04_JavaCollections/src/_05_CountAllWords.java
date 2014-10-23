import java.util.Scanner;


public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        String sentence = in.nextLine();
        System.out.println(sentence.split("\\W+").length);

	}

}
