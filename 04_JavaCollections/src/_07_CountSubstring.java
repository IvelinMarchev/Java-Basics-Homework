import java.util.Scanner;


public class _07_CountSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String sentence = sc.nextLine().toLowerCase();
        String target = sc.nextLine().toLowerCase();
        int repeats = 0;
       
        for (int i = 0; i <= sentence.length() - target.length(); i++) {
        	
            if (sentence.substring(i, i + target.length()).equals(target)){
                    repeats++;
            }
        }
        System.out.println(repeats);
	}

}
