
public class TVTest {
	public static void main(String[] args) {
		TV myTv = new TV();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		
		TV yourTv =new TV();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		System.out.println(
				myTv.channel + ", " +
				myTv.volume + ", " +
				myTv.onOff
				);
		System.out.println(yourTv.channel + ", " +
				yourTv.volume + ", " +
				yourTv.onOff
				);
	}

}
