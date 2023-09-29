import java.util.Scanner;

public class RepeatedElementsa1ascendinga2descending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar1 = new int[n];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}
		int n2 = scan.nextInt();
		int[] ar2 = new int[n2];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = scan.nextInt();
		}
		printRepeatedElementsDescendingarray2(ar1,ar2);
	}

	 static void printRepeatedElementsDescendingarray2(int[] ar1, int[] ar2) {
		 int i=0,j=ar2.length-1;
		 while(i<ar1.length && j>=0)
		 {
			 if(ar1[i]==ar2[j])
			 {
				 System.out.print(ar1[i]+" ");
				 i++;
				 j--;
			 }
			 else if(ar1[i]<ar2[j])
			 {
				 i++;
			 }
			 else {
				 j--;
			 }
		 }
	}

}
