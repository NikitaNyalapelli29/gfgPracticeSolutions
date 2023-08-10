class GFG {
    String longest(String names[], int n) {
        String answer = names[0];
        for(int i=1; i<n; i++){
            if(answer.length()< names[i].length()){
                answer = names[i];
            }
        }
        return answer;
    }
}
