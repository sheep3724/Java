package collection;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리");
		team.add("프로그래머");
		System.out.println(team);
	}
}
