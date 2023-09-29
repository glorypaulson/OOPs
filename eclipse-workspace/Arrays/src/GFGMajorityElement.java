import java.util.Scanner;

public class GFGMajorityElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printmajority(ar);
	}

	 static void printmajority(int[] ar) {
//		 int count=1;
//		 for (int i = 0; i < ar.length-1; i++) 
//		 {
//			for (int j = i+1; j < ar.length; j++) 
//			{
//				if(ar[i]==ar[j])
//				{
//					count++;
//				}
//			}
//			count=1;
//		}
//		 System.out.println(count);
	}

}
