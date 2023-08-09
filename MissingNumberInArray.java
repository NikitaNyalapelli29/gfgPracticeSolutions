class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum =0;
        int totalSum=(n*(n+1)/2);
        for(int i: array){
            sum =sum+i;
        }
        return totalSum-sum;
    }
}
