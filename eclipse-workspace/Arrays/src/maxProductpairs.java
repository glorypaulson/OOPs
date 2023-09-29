import java.util.Scanner;

public class maxProductpairs {
	static int maxproduct(int[] ar)
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
        if(p1>p2)
        {
        	return p1;
        }
        return p2;
    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int n=scanner.nextInt();
	        int[] ar =new int[n];
	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i]=scanner.nextInt();
	        }
	        System.out.print(maxproduct(ar));
	}

}
