import java.util.Scanner;

public class printlongestconsecsubarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printlongestconsecutivesubarrays(ar);
//		printIncreasingSubarray(ar);
	}

	  static void printIncreasingSubarray(int[] ar) {
		  int start=0,end=0,ei=0,si=0;
			 for (int i = 0; i < ar.length-1; i++) {
				if(ar[i+1]>ar[i])
				{
					ei++;
				}
				else {
					if(ei-si>end-start)
					{
						start=si;
						end=ei;
					}
					si=i+1;
					ei=i+1;
				}
			}
			 if(ei-si>end-start)
				{
					start=si;
					end=ei;
				}
			 for (int i = start; i <= end; i++) {
				System.out.print(ar[i]+" ");
			}
	}

	static void printlongestconsecutivesubarrays(int[] ar) {
		 int start=0,end=0,ei=0,si=0;
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i+1]-ar[i]==1)
			{
				ei++;
			}
			else {
				if(ei-si>end-start)
				{
					start=si;
					end=ei;
				}
				si=i+1;
				ei=i+1;
			}
		}
		 if(ei-si>end-start)
			{
				start=si;
				end=ei;
			}
		 for (int i = start; i <= end; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
