import java.util.Scanner;

public class nminus1Combinations {
	static void combinations(int[] ar)
    {
		int sum=0;
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i]; 
		}
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>max)
			{
				max=ar[i];
			}
			else if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(sum-max);
		System.out.println(sum-min);
    }


	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int[] ar=new int[N];
			for (int i = 0; i < ar.length; i++) {
				ar[i]=scan.nextInt();
			}
	       combinations(ar);
	}

}
