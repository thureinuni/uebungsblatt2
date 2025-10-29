package h3;

public class H3_main {
	public static void main(String args[]) {
		int i = 150;
		int j = 8;
		int k = -10;

		// i > j (Ausdruck 1) , i > 200 (Ausdruck 2, j > 100 (Ausdruck 3)

		// Ausdruck 1 wahr und Ausdruck 2,3 nicht wahr k = 1

		if (i > j) // Nur wenn Ausdruck 1 wahr ist werden nun die beiden anderen Ausdrücke
					// überprüft

		{

			// Überprüfung der beiden anderen Ausdrücke

			if (i < 200 & j < 100) {
				k = 1;
				System.out.println("k ist " + k);
			}

			// Ausdruck 1, 2 wahr und Ausdruck 3 nicht wahr k = 2

			if (i > j && i > 200) // nur wenn Ausdruck 1 und 2 wahr sind wird Ausdruck 3 überprüft

				// Überprüfung vom 3. Ausdruck

				if (j < 100) {
					k = 2;
					System.out.println("k ist " + k);
				}

			// Ausdruck 1,2,3 wahr k = 3

			if (i > j && i > 200 && j > 100) {
				k = 3;
				System.out.println("k ist " + k);
			} // alle 3 Ausdrücke werden hier nacheinander überprüft
		}

		// Ausdruck 1,2,3 nicht wahr k = 4

		else {
			System.out.println("k ist " + k);
		}
	}
}
