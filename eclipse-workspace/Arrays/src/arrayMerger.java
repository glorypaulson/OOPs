//TAI portal question
import java.util.Scanner;

public class arrayMerger {

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
	    int[] result=printMergedArray(ar1,ar2);	
	    System.out.print("Merged array: ");
	    for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	static int[] printMergedArray(int[] ar1, int[] ar2) {
		int[] res=new int[ar1.length+ar2.length];
		int i=0,k=0,j=0;
		while(k<res.length)
		{
			if(i<ar1.length)
			{
				res[k++]=ar1[i++];
			}
			else {
				res[k++]=ar2[j++];
			}
		}
		return res;
	}

}
