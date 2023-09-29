import java.util.Scanner;

public class smallestsubarrayssumequaltok {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int k=scan.nextInt();
		smallestSubArray(ar,k);
	}

	 static void smallestSubArray(int[] ar, int k) {
		 boolean s = false;
		 for (int size = 0; size <= ar.length; size++) {
			for (int i = 0; i <= ar.length-size; i++) {
				int sum=0;
				for (int j = i; j < i+size ; j++) 
				{
					sum=sum+ar[j];
				}
				if(sum==k)
				{
					s=true;
					for (int j = i; j < i+size ; j++) {
						System.out.print(ar[j]+" ");
					}
					return;
				}
			}
		}
		 if(s==false)
		 {
			 System.out.print("No subarray found.");
		 }
	}

}
