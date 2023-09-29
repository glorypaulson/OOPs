
//wrong
import java.util.Scanner;

public class GFGLargestSumEqualTo0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int res=printLargest(ar);
		System.out.println(res);
	}

	 static int printLargest(int[] ar) {
		 int count=0;
	        for(int size=1;size<=ar.length;size++)
	        {
	            for(int i=0;i<=ar.length-size;i++)
	            {
	            int sum=0;
	            for(int j=i;j<i+size;i++)
	            {
	                sum=sum+ar[j];
	            }
	            if(sum==0)
	            {
//	                for(int j=i;j<i+size;i++)
//	                {
	                    count++;
//	                }
	            }
	        }
	        }
	        
	        return count;
	}

}
