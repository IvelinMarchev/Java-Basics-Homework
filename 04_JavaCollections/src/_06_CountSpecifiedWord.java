import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String sentence = sc.nextLine();
        String target = sc.nextLine();
        int repeats = 0;
       
        String[] words = sentence.split("\\W+");
       
        for (String word : words) {
                if (word.toLowerCase().equals(target.toLowerCase()))
                        repeats++;                              
        }
       
        System.out.println(repeats);

	}

}
