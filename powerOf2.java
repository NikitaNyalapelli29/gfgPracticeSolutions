class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        long count = 0;
        long num=0;
        if(n > 0){
            while(n>num)
            {
                num = (long)Math.pow(2,count);
                count++;
                
            }
            if(num==n){
                return true;
            }
        }
        return false;
    }
    
}
