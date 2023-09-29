import java.util.Scanner;

public class occurenceOFLargest {
	 static int occurenceLargest(int[] ar)
	    {
		 int count=0;                // This approach takes only O(n) which more efficient than other one
	        int max=Integer.MIN_VALUE;
	        for (int i = 0; i < ar.length; i++) 
	        {
				if(ar[i]>max)
	            {
					count=1;
	                max=ar[i];
	            }
				else if(ar[i]==max)
				{
					count++;
				}
			}
	        return count;
//	        int count=0;            this approach requires O(n2) because of 2for loops
//	        for (int i = 0; i < ar.length; i++) 
//	        {
//				if(ar[i]==max)
//	            {
//	                count++;
//	            }
//			}
//	        return count;
	    }
	

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        // implement your logic here
	        int[] ar=new int[N];
			for (int i = 0; i < ar.length; i++) {
				ar[i]=scan.nextInt();
			}
	        System.out.println(occurenceLargest(ar));
	}

}
