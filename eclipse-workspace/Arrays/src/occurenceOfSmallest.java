import java.util.Scanner;

public class occurenceOfSmallest {
	 static int occurenceSmallest(int[] ar)
	    {
		 	int count=0;                // This approach takes only O(n) which more efficient than other 
                                        //	one
	        int min=Integer.MAX_VALUE;
	        for (int i = 0; i < ar.length; i++) 
	        {
				if(ar[i]<min)
	            {
					count=1;
	                min=ar[i];
	            }
				else if(ar[i]==min)
				{
					count++;
				}
			}
	        return count;
	    }
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        // implement your logic here
	        int[] ar=new int[N];
			for (int i = 0; i < ar.length; i++) {
				ar[i]=scan.nextInt();
			}
	        System.out.println(occurenceSmallest(ar));
	}

}
