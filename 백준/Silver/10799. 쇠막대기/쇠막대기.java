import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static int checkVPS(String data) {
		int result = 0;
		Stack<Character> stack = new Stack<Character>();
		char[] dataArr = data.toCharArray();
		for(int i=0; i<data.length();i++){
			if(dataArr[i]=='(') {
					stack.push('c');
			}else {
				if(dataArr[i-1]=='('){
					stack.pop();
					result = result + stack.size();
				}else {
				stack.pop();	
				result = result + 1;	
				}
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		System.out.println(checkVPS(data));			
	}
}
