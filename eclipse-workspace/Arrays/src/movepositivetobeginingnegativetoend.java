import java.util.Scanner;

public class movepositivetobeginingnegativetoend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printpostivetobegin(ar);
	}

	 static void printpostivetobegin(int[] ar) {
//		 int i=ar.length-1;
//		 int k=ar.length-1;
//		 while(i>=0)
//		 {
//			 if(ar[i]<0)
//			 {
//				 k--;
//				 i--;
//			 }
//			 else if(ar[i]>=0)
//			 {
//				 ar[k]=ar[i];
//				 k--;
//				 i--;
//			 }
//		 }
//		 for (int j = 0; j < ar.length; j++) {
//			System.out.print(ar[j]+" ");
//		}
//		int[] temp=new int[ar.length];
//		int i=0;
//		int j=0;
//		while(i<ar.length) {
//			if(ar[i]>=0)
//			{
//				temp[j]=ar[i];                           tai logic but not correct
//				j++;
//			}
//		}
//		while(i<ar.length) {
//			if(ar[i]<0)
//			{
//				temp[j++]=ar[i++];
//			}
//		}
//		for (int k = 0; k < temp.length; k++) {
//			ar[k]=temp[k];
//		}
//		for (int l = 0; l < ar.length; l++) {
//			System.out.print(ar[l]+" ");
//		}	
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>=0)
			{
				System.out.print(ar[i]+" ");
			}
		}                                            // just printing logic but not upto expectation
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<0)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}

}
