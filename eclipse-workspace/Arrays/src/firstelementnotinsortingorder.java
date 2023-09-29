import java.util.Scanner;

public class firstelementnotinsortingorder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printelement(ar);
	}

	 static void printelement(int[] ar) {
		 boolean b=false;
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i+1]<ar[i])
			{
				b=true;
				System.out.print(ar[i+1]+" ");
				break;
			}
		}
		 if(b==false) {
			 System.out.print(-1);
		 }
	}

}
