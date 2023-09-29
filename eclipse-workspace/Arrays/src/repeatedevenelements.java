import java.util.Scanner;

public class repeatedevenelements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar1 = new int[n];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}
		int n2 = scan.nextInt();
		int[] ar2 = new int[n2];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = scan.nextInt();
		}
		printEvenRepeatedElements(ar1,ar2);
	}

	 static void printEvenRepeatedElements(int[] ar1, int[] ar2) {
		 int i=0,j=0;
		 while (i<ar1.length && j<ar2.length) {
			if (ar1[i]%2!=0) 
			{
				i++;
			}
			else if(ar2[j]%2!=0)
			{
				j++;
			}
			else if(ar1[i]%2==0 && ar2[j]%2==0)
			{
				if (ar1[i]==ar2[j]) 
				{
					System.out.print(ar1[i]+" ");
					i++;
					j++;
				} 
				else if(ar1[i]<ar2[j])
				{
					i++;
				}
				else 
				{
					j++;
				}
			} 
		}
	}

}
