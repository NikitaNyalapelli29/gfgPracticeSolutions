class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> list = new ArrayList<String>();
        for(int i = S.length(); i>0; i--){
            list.add(S.substring(0,i));
        }
        return list;
    }
};
