import java.util.Scanner;

public class countOccurenceOSmallestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println(countOccurenceSmallest(ar));
	}

	 static int countOccurenceSmallest(int[] ar) {
		 int count=1;
		 for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else {
				break;
			}
		}
		 return count;
		 
	 }

}
