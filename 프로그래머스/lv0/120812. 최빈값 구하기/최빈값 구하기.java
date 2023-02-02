class Solution {
    static int solution(int[] array) {
        int answer = 0;
        int count = 0;
        int maxcount = 0;
        int check = 0;
        for(int i = 0; i<array.length; i++) {
        	count = 0;
        	if(answer==array[i]) {
        		continue;
        	}
        	for(int j = 0; j<array.length; j++) {
        		if(array[i]==array[j]) {
        			count++;
        		}
        	}
        	if(maxcount<count) {
        		maxcount = count;
        		answer = array[i];
        		check = 0;
        	}else if(maxcount == count) {
        		check++;
        	}
        }
        if(check >= 1) {
        	return -1;
        }
        return answer;
    }
}