
public class Math_test3 {

	public static void main(String[] args) {
		int math = 90;
		int eng = 80;
		/*
		 1. 영어점수가 80점을 초과하면,
		 	영어시험 목표 달성 성공
		 	아니면, 영어시험 목표 달성 실패
		 	
		 2. 영어점수가 80점초과, 수학점수가 90점 초과
		  	게임기 구매
		  	아니면, 스티커 구매
		 */
		if(eng > 80) {
			System.out.println("영어시험 목표 달성 성공");
		}else {
			System.out.println("영어시험 목표 달성 실패");
		}
		if((eng > 80)&&(math > 90)) {
			System.out.println("게임기 구매");
		}else {
			System.out.println("스티커 구매");
		}
	}

}
