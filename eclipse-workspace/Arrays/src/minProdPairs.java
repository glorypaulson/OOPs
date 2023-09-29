import java.util.Scanner;

public class minProdPairs {
	static int minproduct(int[] ar)
    {
        int max=Integer.MIN_VALUE,sec_max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                sec_max=max;
                max=ar[i];
            }
            else if(ar[i]>sec_max)
            {
                sec_max=ar[i];
            }
        }
        int min=Integer.MAX_VALUE,sec_min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
        	if(ar[i]<min)
        	{
        		sec_min=min;
        		min=ar[i];
        	}
        	else if(ar[i]<sec_min)
        	{
        		sec_min=ar[i];
        	}
        }
        int p1=max*sec_max;
        int p2=min*sec_min;
        int p3=max*min;
        if(p1<p2 && p1<p3)  // consider the first largest and first smallest when u have negative and 
                            //    positive values 
                            //        	like eg -5 -4 -3 2 1
        {
        	return p1;
        }
        else if(p3<p1 && p3<p2)
        {
        	return p3;
        }
        else {
        	return p2;
        }
    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int n=scanner.nextInt();
	        int[] ar =new int[n];
	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i]=scanner.nextInt();
	        }
	        System.out.print(minproduct(ar));
	}

}

// Chatgpt solution
//import java.util.Scanner;
//
//public class minProdPairs{
//
//    static int minproduct(int[] ar) {
//        int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE, sec_min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < ar.length; i++) {
//            if (ar[i] > max) {
//                sec_max = max;
//                max = ar[i];
//            } else if (ar[i] > sec_max) {
//                sec_max = ar[i];
//            }
//
//            if (ar[i] < min) {
//                sec_min = min;
//                min = ar[i];
//            } else if (ar[i] < sec_min) {
//                sec_min = ar[i];
//            }
//        }
//
//        int p1 = max * sec_max;
//        int p2 = min * sec_min;
//        if (p1 < p2) {
//            return p1;
//        }
//        return p2;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] ar = new int[n];
//        for (int i = 0; i < ar.length; i++) {
//            ar[i] = scanner.nextInt();
//        }
//        System.out.print(minproduct(ar));
//    }
//}
















