
public class _03_FullHouse {

	public static void main(String[] args) {
		String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] suits = {'♣', '♦', '♥', '♠' };
		int count = 0;
		
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				for (int k = 0; k < suits.length; k++) {
					for (int k1 = k + 1; k1 < suits.length; k1++) {
						for (int l = k1 + 1; l < suits.length; l++) {
							for (int l2 = 0; l2 < suits.length; l2++) {
								for (int m = l2 + 1; m < suits.length; m++) {
									if (i!=j) {
										System.out.printf("(%s%c %s%c %s%c %s%c %s%c) ... ", faces[i], suits[k],
																					faces[i], suits[k1],
																					faces[i], suits[l],
																					faces[j], suits[l2],
																					faces[j], suits[m]);
										count++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(count + " full houses");
	}

}
