class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        long min = a[0];
        long max = a[a.length-1];
        return new Pair(min, max);
    }
}
