package h3;

public class H3_main {
	public static void main (String args[]) {
		int i = 140;
		int j = 150;
		int k = -10;
		
		// i > j (Ausdruck 1) , i > 200 (Ausdruck 2, j > 100 (Ausdruck 3)
		
		// Audruck 1 wahr und Ausdruck 2,3 nicht wahr k = 1
		if (i > j) {
			k = 1;
			System.out.println(k);
		}
		
		// Audruck 1, 2 wahr und Ausdruck 3 nicht wahr k = 2
		if (i > j && i > 200) {
			k = 2; 
			System.out.println(k);
		}
		
		// Audruck 1,2,3 wahr k = 3
		if ( i > j && i > 200 && j > 100) {
			k = 3;
			System.out.println(k);
		}
			
		// Audruck 1,2,3 nicht wahr k = 4
		if ( i < j && i < 200 && j < 100) {
			k = 4;
			System.out.println(k);
		}
		
		else {
			System.out.println(k);}
	}
}

