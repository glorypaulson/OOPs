import java.util.Scanner;

public class printcountOfsubarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
//		printconseccountofsubarrays(ar);
//		printMaxcountofconsecsubarrays(ar);
		printnonconsecutivesubarrays(ar);
	}

	   static void printnonconsecutivesubarrays(int[] ar) {
		   
	}

	static void printMaxcountofconsecsubarrays(int[] ar) {
		  int max=0;
		  int count=1;
		  for (int i = 0; i < ar.length-1; i++) {
			if (ar[i+1]-ar[i]==1) {
				count++;
			} 
			else {
				if(count>max)
				{
					max=count;
				}
				count=1;
			}
		}
		  if(count>max)
			{
				max=count;
			}
		  System.out.print(max);
	}

	static void printconseccountofsubarrays(int[] ar) {
		 int count=1;
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i+1]-ar[i]==1){
				count++;
			}
			else {
				System.out.print(count+" ");
				count=1;
			}
		}
		 System.out.print(count);
	}
	 

}
