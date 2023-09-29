import java.util.Scanner;

public class moveminusonetorightend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		moveMinusOneToLeft(ar);
	}

	 static void moveMinusOneToLeft(int[] ar) {
//		 int count=0;
//		 for (int i = 0; i <ar.length; i++) {
//			if(ar[i]!=-1)
//			{
//				ar[count++]=ar[i];
//			}
//		}
//		 while(count<ar.length)
//		 {
//			 ar[count++]=-1;
//		 }
//		int i=0;
//		int temp=0;
//		int n=ar.length-1;
//		while(i<n)
//		{
//			temp=ar[i];
//			ar[i]=ar[n];
//			ar[n]=temp;
//			i++;
//			n--;
//		}
		/* The following steps might be helpful:

			 Start by assigning two pointers i and j to the last index of the array.

			 Loop until i drops below 0.

			 During this loop, check if the ith element equals -1.

			 If true, decrement i.
			 Conversely, move the ith element to the jth position in the array and decrement both i and j.
			 Once all non-negatives are at the end of the array (i will have gone below 0) start a second loop which continues till j drops below 0.

			 During this second loop, assign -1 to the jth position in the array and decrement j.

			 Finally, print your array!

			 Amazing work so far and keep it up! 💪🔥 */
		 
		 int i=ar.length-1;
		 int j=ar.length-1;
		 while(i>=0)
		 {
			if(ar[i]==-1)
			{
				i--;
			}
			else {
				ar[j--]=ar[i--];
			}
		}
		while(j>=0)
		{
			ar[j--]=-1;
		}
		for (int j2 = 0; j2 < ar.length; j2++) {
			System.out.print(ar[j2]+" ");
		}
	}

}
