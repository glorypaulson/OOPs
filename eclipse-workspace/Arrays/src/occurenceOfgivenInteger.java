import java.util.Scanner;

public class occurenceOfgivenInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int k=scan.nextInt();
		System.out.println(occurenceOfK(ar,k));
	}

	 static int occurenceOfK(int[] ar,int k) {
		 int count=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==k)
			{
				count++;
			}
		}
		return count;
	}

}
