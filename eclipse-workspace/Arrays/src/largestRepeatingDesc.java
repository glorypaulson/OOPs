import java.util.Scanner;

public class largestRepeatingDesc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println(largestrepeatingdesc(ar));
	}

	 static int largestrepeatingdesc(int[] ar) {
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1])
			{
				return ar[i];
			}
		}
		 return -1;
	 }

}
