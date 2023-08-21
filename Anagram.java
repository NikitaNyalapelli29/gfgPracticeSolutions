class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aCharArray = a.toCharArray();
        char[] bCharArray = b.toCharArray();
        if(a.length()==b.length()){
            Arrays.sort(aCharArray);
            Arrays.sort(bCharArray);
        }
        return Arrays.equals(aCharArray, bCharArray);
    }
}
