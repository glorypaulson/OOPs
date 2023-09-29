import java.util.Scanner;

public class mergetwoarraysandsort {

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
		int[] result= merge(ar1,ar2);
		System.out.println("Merged array:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	 static int[] merge(int[] ar1, int[] ar2) {
		 int[] res=new int[ar1.length+ar2.length];
		 int i=0,j=0,k=0;
		 while(i<ar1.length && j<ar2.length) {
			 if(ar2[j]<=ar1[i]) {
				 res[k++]=ar2[j++];
			 }
			 else {
				 res[k++]=ar1[i++];
			 }
		 }
		 while(i<ar1.length)               // to print the left out elements
		 {
			 res[k++]=ar1[i++];
		 }
		 while (j<ar2.length) {			 // to print the left out elements
			res[k++]=ar2[j++];
		}
		 return res;
	}

}
