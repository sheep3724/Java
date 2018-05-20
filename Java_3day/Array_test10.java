
public class Array_test10 {
	public static void main(String[] args) {
		//1. 배열에 데이터를 집어 넣음.
		int[] num = {90, 80, 20, 60, 70};
		//2. 최소값을 넣을 수 있는 임의의 변수 1개를 만들어서,
		// 배열의 첫번째 값을 넣음.
		int mini = num[0];
		//3. 배열을 순회하면서 비교합니다.
		for(int i = 0; i < num.length; i++)
		{
			if(mini > num[i])
			{
				mini = num[i];
			}
		}
		System.out.println("최소값은 : " + mini);
	}
}
