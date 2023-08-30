class Solution {
    static String revStr(String S) {
        // code here
        String str = "";
        for(int i = S.length()-1; i>=0; i--)
        {
            str+=S.charAt(i);
        }
        return str;
    }
}
