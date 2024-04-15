import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] chNum = Integer.toString(n).toCharArray();
        
        for(char c : chNum) {
            answer += Character.getNumericValue(c);
        }
        
        return answer;
    }
}