import java.util.Scanner;

public class oddrepeatinglemensts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] ar1 = new int[n1];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = scan.nextInt();
		}
		int n2 = scan.nextInt();
		int[] ar2 = new int[n2];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = scan.nextInt();
		}
		OddRepeating(ar1,ar2);
	}

	 static void OddRepeating(int[] ar1, int[] ar2) {
		 int i=0,j=0;
		 boolean b=false;
		 while(i<ar1.length && j<ar2.length)
		 {
			 if(ar1[i]%2==0)
			 {
				 i++;
			 }
			 else if(ar2[i]%2==0){
				 j++;
			 }
			 else if(ar1[i]%2!=0 && ar2[i]%2!=0)
			 {
				 if(ar1[i]==ar2[j]) {
					 b=true;
					 System.out.print(ar1[i]+" ");
					 i++;
					 j++;
				 }
				 else if(ar1[i]<ar2[j])
				 {
					 i++;
				 }
				 else {
					 j++;
				 }
			 }
			 
		 }
		 if(b==false) {
			 System.out.println("No Common odd elements found");
		 }
	}

}
