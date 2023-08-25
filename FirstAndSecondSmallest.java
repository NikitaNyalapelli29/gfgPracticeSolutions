class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        Arrays.sort(a);
        if(n>=2)
        {
            for(int i =0; i<a.length; i++)
            {
                if(a[0] != a[i])
                {
                    return new long[]{a[0],a[i]};
                }
            }
            
        }
        return new long[]{-1,-1};
    }
}
