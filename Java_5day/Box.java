
public class Box {
	int width;
	int length;
	int height;
	int volume;//부피
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	public int getVolume() {
		volume = width * length * height;
		return volume;
	}
}
