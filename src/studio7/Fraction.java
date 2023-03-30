package studio7;

public class Fraction {
	private int num;
	private int deno;
	
	public Fraction(int n, int d) {
		num=n;
		deno=d;
	}
	
	public String add(int n2, int d2) {
		return ((int)(num*d2+n2*deno)+"/"+deno*d2);
	}
	public String multi(int n2, int d2) {
		return ((int)(num*n2)+"/"+deno*d2);
	}
	
	public static void main(String[] args) {
		Fraction f = new Fraction(2,3);
		System.out.println(f.add(4, 5));

	}

}
