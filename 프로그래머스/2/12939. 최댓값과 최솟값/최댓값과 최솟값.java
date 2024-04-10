import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numStr = s.split(" ");
        int[] numbers = new int[numStr.length];

        // String to int
        for(int i=0; i<numStr.length; i++){
            numbers[i] = Integer.parseInt(numStr[i]);
        }

        // Sort ascending
        Arrays.sort(numbers);
        
        // Sort ascending (no use util)
        // for(int first=0; first<numbers.length-1; first++) {
        //     for(int second=first+1; second<numbers.length; second++) {
        //         if(numbers[first] > numbers[second]) {
        //             int temp = numbers[first];
        //             numbers[first] = numbers[second];
        //             numbers[second] = temp;
        //         }
        //     }
        // }
        
        answer = numbers[0] + " " + numbers[numbers.length-1];
        
        return answer;
    }
}