package h2;

public class H2_main {
	public static void main (String args[]) {
		int i = 7 ;
		int j = 10;
		int k = 400;
		int min = 0 ; // Damit min initisialisiert ist
		int max = 0;  // Damit max initisalisiert ist

		
		// Um das Minimum aus i, j, k zu finden, dadurch das man mehrere Vergleiche hat && benutzt
		
		if (i < j && i < k) {
			min = i;
		}
		
		if (j < i && j < k) {
			min = j;
		}
		
		if (k < i && k < j) {
			min = k;
		}
		System.out.println(min);
		
		// Um das Maximum aus i, j, k zu finden, dadurch das man mehrere Vergleiche hat && benutzt
		
		if (i > j && i > k) {
			max = i;
		}
		
		if (j > i && j > k) {
			max = j;
		}
		
		if (k > i && k > j) {
			max = k;
		}
		System.out.println(max);


	}

}