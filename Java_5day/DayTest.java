
public class DayTest {
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(day1);
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println("며칠간 했는지  : " + Day.count);
		System.out.println("전체하는 일의 시간 : " + Day.sum);
		System.out.println("평균 하는 일의 시간 : " + Day.avg);
	}
}
