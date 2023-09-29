/*
counting the unique elements in an array for eg 1 2 3 3 4 4 4 5 the output must be 5 because of counting 
1 2 3 4 5 including the repeated elements similarly for 123456 print 6
*/
import java.util.Scanner;

public class countUniqueElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println(countuniqueElements(ar));
	}

	static int countuniqueElements(int[] ar)
    {
        int count=1;
        int c_ele=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                count++;
            }
            else{
                if(count>=1)
                {
                    c_ele++;
                }
                count=1;
            }
        }
        if(count>=1)
        {
            c_ele++;
        }
        return c_ele;
    }

}
// test case 1 3 5 failed