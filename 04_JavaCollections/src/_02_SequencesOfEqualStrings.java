import java.util.Scanner;


public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		
		String words = in.nextLine();
		String[] strArray = words.split(" ");
		System.out.print(strArray[0]);
		
		for(int i = 1; i < strArray.length;i++){
			
			if (strArray[i].equals(strArray[i - 1])) {
				System.out.printf(" %s", strArray[i]);
			}
			else {
				System.out.println();
				System.out.print(strArray[i]);
				
			}
		}

	}
}
