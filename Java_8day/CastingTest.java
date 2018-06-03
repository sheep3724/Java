
public class CastingTest {
	public static void main(String[] args) {
		byte b = 100; //~127
		int i1 =b; //자동형변환 (큰 <- 작)
		
		int i2 = 200;
		byte b2 = (byte)i2; //강제형변환(작 <- 큰)
		
	}
}
