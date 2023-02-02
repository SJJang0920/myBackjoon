class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true){
            if(answer!=0 && answer*6%n == 0){
                break;    
            }
            answer++;
        }
        return answer;
    }
}