import java.util.Scanner;

public class Rearrangeminusonetoend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		rearrange(ar);
	}

	 static void rearrange(int[] ar) {
		 int j=0;
		 int i=0;
		 while(i<ar.length)
		 {
			 if(ar[i]==-1)    // same for zero
			 {
				 i++;
			 }
			 else {
				 ar[j++]=ar[i++];
			 }
		 }
		 while(j<ar.length){
			 ar[j++]=-1;    // same for zero
		 }
		 for (int k = 0; k < ar.length; k++) {
			System.out.print(ar[k]+" ");
		}
	}

}
