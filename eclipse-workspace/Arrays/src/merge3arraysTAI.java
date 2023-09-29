import java.util.Scanner;

public class merge3arraysTAI {

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
		int n3 = scan.nextInt();
		int[] ar3 = new int[n3];
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = scan.nextInt();
		}
		int[] result = printmergedarray(ar1,ar2,ar3);
		System.out.print("Merged array: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	 static int[] printmergedarray(int[] ar1, int[] ar2, int[] ar3) {
		 int i=0,j=0,k=0,l=0;
		 int[] res=new int[ar1.length+ar2.length+ar3.length];
		 while(k<res.length)
		 {
			 if(i<ar1.length){
				 res[k++]=ar1[i++];
			 }
			 else if(j<ar2.length){
				 res[k++]=ar2[j++];
			 }
			 else if(l<ar3.length){
				 res[k++]=ar3[l++];
			 }
		 }
		 return res;
	}

}
