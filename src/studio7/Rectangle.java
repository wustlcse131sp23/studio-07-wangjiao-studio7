package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int l, int w) {
		length=l;
		width=w;
	}
	
	public int area() {
		return length*width;
	}
	
	public int perimeter() {
		return (length+width)*2;
	}
	
	public boolean square() {
		if (length==width)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,6);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		System.out.println(r.square());
	}

}
