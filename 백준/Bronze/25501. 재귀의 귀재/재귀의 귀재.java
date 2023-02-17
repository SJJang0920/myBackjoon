import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String s = br.readLine();
			bw.write(isPalindrome(s)+" "+count+"\n");
		}
		bw.flush();
		bw.close();
	}
	public static int recursion(String s, int l, int r){
        if(l >= r) {
        	count++;
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	count++;
        	return 0;
        }
        else {
        	count++;
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
    	count = 0;
        return recursion(s, 0, s.length()-1);
    }
}