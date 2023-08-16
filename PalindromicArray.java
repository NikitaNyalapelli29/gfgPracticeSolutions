//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int count = 0;
                  for(int i = 0; i<a.length; i++)
                  {
                      int temp = a[i];
                      int pal =0;
                      while(a[i]>0)
                     {
                          int rem = a[i]%10;
                          pal = (pal*10)+ rem;
                          a[i]/=10;
                      }
                      if(temp == pal)
                      {
                          count++;
                      }
                      else
                      {
                          return 0;
                      }
                  }
                  return 1;
                 
           }
}
