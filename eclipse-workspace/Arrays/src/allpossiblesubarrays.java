import java.util.Scanner;

public class allpossiblesubarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		possiblesubarrays(ar);
	}

	 static void possiblesubarrays(int[] ar) {
		 for (int i = 0; i < ar.length; i++) {
			 for (int j = i; j < ar.length; j++) {
				for (int k = i; k<= j; k++) {
					System.out.print(ar[k]+" ");
				}
				System.out.println();
			}
			 
		}
		 
	}

}
