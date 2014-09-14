import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] firstDate = input.nextLine().split("-");
		String[] secondDate = input.nextLine().split("-");
		
		LocalDateTime start = LocalDateTime.of(Integer.parseInt(firstDate[2]), Integer.parseInt(firstDate[1]), Integer.parseInt(firstDate[0]), 0, 0);
		LocalDateTime finish = LocalDateTime.of(Integer.parseInt(secondDate[2]), Integer.parseInt(secondDate[1]), Integer.parseInt(secondDate[0]), 0, 0);
		
		Duration daysBetween = Duration.between(start, finish);
		System.out.println(daysBetween.toDays());
	}

}
