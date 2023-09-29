// print *#$ between every number
// 7 3 2 4 9 5
// 7*3$2#4$9*5
import java.util.Scanner;

public class patternstype {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printstardollarhash(ar);
		
	}

	 static void printstardollarhash(int[] ar) {
		 for (int i = 0; i < ar.length-1; i++) {
			if (ar[i]%2!=0 && ar[i+1]%2!=0) {
				System.out.print(ar[i]+"*");
			} 
			else if (ar[i]%2==0 && ar[i+1]%2==0){
				System.out.print(ar[i]+"#");
			}
			else {
				System.out.print(ar[i]+"$");
			}
		}
		 System.out.print(ar[ar.length-1]);
	 }

}
