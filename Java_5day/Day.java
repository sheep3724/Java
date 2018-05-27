
public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	static int avg;
	Day(String d, int t, String l){
		doing = d;
		time = t;
		location = l;
		count++;
		sum = sum+t;
		avg = sum/3;
	}
	public String toString() {
		return doing + ", " + time + ", " + location;
	}
}

