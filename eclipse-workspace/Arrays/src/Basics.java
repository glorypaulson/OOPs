import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int[] ar = new int[N];
		 for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		 for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
