import java.util.Scanner;

public class movezerostobegining {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		moveZerosToBeginning(ar);
	}

	 static void moveZerosToBeginning(int[] ar) {
		 int i=ar.length-1;
		 int j=ar.length-1;
		 while(i>=0)
		 {
			 if(ar[i]==0)
			 {
				 i--;
			 }
			 else {
				 ar[j--]=ar[i--];
			 }
		 }
		 while(j>=0)
		 {
			 ar[j--]=0;
		 }
		 for (int j2 = 0; j2 < ar.length; j2++) {
			System.out.print(ar[j2]+" ");
		}
	}

}
