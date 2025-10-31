package h2;

public class H2_main {
	public static void main (String args[]) {
		int i = 7 ;
		int j = 900;
		int k = 400;
		int min = 0 ; // Damit min initialisiert ist
		int max = 0;  // Damit max inittialisiert ist

		
		// Um das Minimum aus i, j, k zu finden, dadurch das man mehrere Vergleiche hat && benutzt
		
		if (i < j & i < k) {
			min = i;
		}
		
		else if (j < i & j < k) {
			min = j;
		}
		
		else  {
			min = k;
		}
		System.out.println("min = " + min);
		
		// Um das Maximum aus i, j, k zu finden, dadurch das man mehrere Vergleiche hat && benutzt
		
		if (i > j & i > k) {
			max = i;
		}
		
		else if (j > i & j > k) {
			max = j;
		}
		
		else {
			max = k;
		}
		System.out.println("max = " + max);


	}

}