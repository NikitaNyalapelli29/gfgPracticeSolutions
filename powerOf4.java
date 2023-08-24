class Solution
{
    int isPowerOfFour(long n)
    {
	// Your code here	
	int count = 0;
	long num =0;
	if(n>0){
	    while(n>num){
	        num = (long)Math.pow(4,count);
	        count++;
	    }
	    if(num == n){
	        return 1;
	    }
	}
	return 0;
	
    }
}
