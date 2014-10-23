import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		Pattern email = Pattern.compile("[A-Za-z]*[.-_]*[A-Za-z]*@[A-Za-z]*[-]*[.A-Za-z]*[A-Za-z]");
		Matcher match = email.matcher(input);
		
		while (match.find()) {
			System.out.println(match.group());
		}
		

	}

}
