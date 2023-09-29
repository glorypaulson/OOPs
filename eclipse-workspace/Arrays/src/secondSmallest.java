import java.util.Scanner;

public class secondSmallest {
	static int display(int[] ar)
	{
		int small=Integer.MAX_VALUE,secsmall=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<small)
			{
				secsmall=small;
				small=ar[i];
			}
			else if(ar[i]<secsmall && ar[i]!=small)
			{
				secsmall=ar[i];
			}
		}
		return secsmall+small;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println(display(ar));
	}

}
