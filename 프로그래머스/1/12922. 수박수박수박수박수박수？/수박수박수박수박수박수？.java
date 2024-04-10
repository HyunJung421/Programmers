class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=1; (n!=0 && i<n+1); i++) {
            answer += (i%2==1 ? "수" : "박");
        }
        
        return answer;
    }
}