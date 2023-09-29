//if not found then print -1
import java.util.Scanner;

public class printRepeatingElements2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		printrepeatingele(ar);
	}

	 static void printrepeatingele(int[] ar) {
	        int count=1;
	        boolean rep=false;
	        for(int i=0;i<ar.length-1;i++)
	        {
	            if(ar[i]==ar[i+1])
	            {
	                count++;
	            }
	            else
	            {
	               if(count>1)
	               {
	                    System.out.print(ar[i]+" ");
	                    rep=true;
	               }
	                count=1;
	            }
	        }
	        if(count>1){
	            System.out.print(ar[ar.length-1]);
	            rep=true;
	        }
	        if(rep==false)
	        {
	        	System.out.print(-1);
	        }
	}

}
