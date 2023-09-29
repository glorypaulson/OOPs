//3 5 5 6 7 7 7 9
//output: 5 
//        7
import java.util.Scanner;

public class printonlyRepeatingelements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		onlyRepeatingElements(ar);
	}
	 static void onlyRepeatingElements(int[] ar) {
		 int count=1;
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else 
			{
				if (count>1) 
				{
					System.out.println(ar[i]);
				}
				count=1;
			}
		}
		 if (count>1)
		{
			System.out.println(ar[ar.length-1]);
		}
	}
}
