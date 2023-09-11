class Solution {
    static int countSquares(int N) {
        // code here
        int count = 0;
        for(int i = 1; i< Math.sqrt(N); i++)
        {
            if((int)Math.pow(i,2) < N){
                count ++;
            }
        }
        return count;
    }
}
