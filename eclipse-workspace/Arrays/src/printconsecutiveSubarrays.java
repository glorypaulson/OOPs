import java.util.Scanner;

public class printconsecutiveSubarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printConsecutiveSubarry(ar);
	}

	 static void printConsecutiveSubarry(int[] ar) {
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i+1]-ar[i]==1)
			{
				System.out.print(ar[i]+" ");
			}
			else {
				System.out.println(ar[i]);
			}
		}
		 System.out.println(ar[ar.length-1]);
	}

}
