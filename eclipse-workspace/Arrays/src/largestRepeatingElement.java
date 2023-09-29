import java.util.Scanner;

public class largestRepeatingElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println(largestRepeating(ar));
	}

	 static int largestRepeating(int[] ar) {
		 for (int i = ar.length-1; i > 0; i--) {
			if(ar[i]==ar[i-1])
			{
				return ar[i];
			}
		}
		 return -1;
	 }

}
