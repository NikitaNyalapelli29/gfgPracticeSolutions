class Solution
{
   
    String modify(String S)
    {
        // your code here
        String withoutSpace = S.replaceAll("\\s", "");
        return withoutSpace;
    }
}
