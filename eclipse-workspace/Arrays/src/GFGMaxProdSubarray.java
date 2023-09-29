import java.util.Scanner;

public class GFGMaxProdSubarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int res= printmaxprodsubarray(ar);
		System.out.println(res);
	}

	 static int printmaxprodsubarray(int[] ar) {
		 int max=0;
		 for (int size = 1; size <= ar.length; size++) {
			
			for (int i = 0; i <= ar.length -size; i++) {
				int prod=1;
				for (int j = i; j < i+size; j++) {
					prod=prod*ar[j];
				}
				if(prod>max)
				{
					max=prod;
				}
			}
		}
		 return max;
	}

}
