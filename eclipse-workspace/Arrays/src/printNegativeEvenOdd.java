import java.util.Scanner;

public class printNegativeEvenOdd {
	static void display(int[] ar,int n)
	{

		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i]<0)
			{
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2!=0 && ar[i]>0)
			{
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0 && ar[i]>=0)
			{
				System.out.print(ar[i]+" ");
			}			
		}
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] ar=new int[n];
	for (int i = 0; i < ar.length; i++) {
		ar[i]=scan.nextInt();
	}
	display(ar,n);
}
}


