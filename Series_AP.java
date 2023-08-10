class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int diff = A2-A1;  // find the difference
        return (A1+((N-1)*diff));   // use formula: tn = a+(n-1)*d
    }
}
