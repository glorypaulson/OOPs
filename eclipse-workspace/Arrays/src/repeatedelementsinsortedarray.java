import java.util.Scanner;

public class repeatedelementsinsortedarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] ar1 = new int[n1];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}
		int n2 = scan.nextInt();
		int[] ar2 = new int[n2];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = scan.nextInt();
		}
		printrepeartedele(ar1,ar2);
	}

	 static void printrepeartedele(int[] ar1, int[] ar2) {
		 int i=0,j=0;
		 while(i<ar1.length && j<ar2.length)
		 {
			 if(ar1[i]==ar2[j])
			 {
				 System.out.print(ar1[i]+" ");
				 i++;
				 j++;
			 }
			 else if(ar1[i]>ar2[j]) {
				 j++;
			 }
			 else {
				 i++;
			 }
		 }
	}

}
