import java.util.Scanner;

public class Rearrangeminusoneatbeginningandremainingatend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		rearrangeelements(ar);
	}

//	 static void rearrangeelements(int[] ar) {
//		 int left = 0, right = 1;
//
//	        while (left <= right) {
//	            if (ar[left] < 0 && ar[right] >= 0) {
//	                left++;
//	                right++;
//	            } else if (ar[left] >= 0 && ar[right] < 0) {
//	                // Swap negative element from the left with positive element from the right
//	                int temp = ar[left];
//	                ar[left] = ar[right];
//	                ar[right] = temp;
//	                left++;
//	                right++;
//	            } else {
//	                if (ar[left] >= 0) {
//	                    right++;
//	                } else {
//	                    left++;
//	                }
//	            }
//	        }
//	        for (int i = 0; i < ar.length; i++) {
//				System.out.print(ar[i]+" ");
//			}
//	    }
	
	static void rearrangeelements(int[] ar) 
	{
        int n = ar.length;
        int pos = 0;
        
        for (int i = 0; i < n; i++) 
        {
            if (ar[i] < 0) 
            {
                if (i != pos) 
                {
                    int temp = ar[i];
                    for (int j = i; j > pos; j--) 
                    {
                        ar[j] = ar[j - 1];
                    }
                    ar[pos] = temp;
                }
                pos++;
            }
        }
        for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
    }
	
	
	
	}

