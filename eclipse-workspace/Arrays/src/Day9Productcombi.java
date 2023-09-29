import java.util.Scanner;

public class Day9Productcombi {
	static int[] prodcombinations(int[] ar)
    {
		int p=1;
		for (int i = 0; i < ar.length; i++) {
			p=p*ar[i];
		}
		for (int i = 0; i < ar.length; i++) {
			ar[i]=p/ar[i];
		}
		return ar;
    }

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int[] ar=new int[N];
			for (int i = 0; i < ar.length; i++) {
				ar[i]=scan.nextInt();
			}
	      int[] result=prodcombinations(ar);
	      for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+ " ");
		}
	}

}
