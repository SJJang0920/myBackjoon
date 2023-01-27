import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Meetingtime> time = new ArrayList<Meetingtime>(); 
		int N = sc.nextInt();
		int count = 0;
		for(int i=0; i<N; i++) {
			time.add(new Meetingtime(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(time);	
		int endtime = 0;
		for (int k = 0; k<N;k++) {
			if(time.get(k).getStart()>=endtime) {
				count++;
				endtime =time.get(k).getEnd();
			}
		}			
		System.out.println(count);	
	}
}	

class Meetingtime implements Comparable<Meetingtime>{
	private int start;
	private int end;
	
	public Meetingtime() {
		super();
	}

	public Meetingtime(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Meetingtime [start=" + start + ", end=" + end + "]";
	}

	@Override
	public int compareTo(Meetingtime obj) {
		int result = 0;
		result = getEnd()-obj.getEnd();
		if(getEnd()==obj.getEnd()) {
			result = getStart()-obj.getStart();
		}
		return result;
	}	
}
