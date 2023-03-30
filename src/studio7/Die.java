package studio7;

public class Die {
	private int n;
	
	public Die(int inputN) {
		n=inputN;
	}
	
	public int roll() {
		return (int)(Math.random()*n+1);
	}
	
	public static void main(String[] args) {
		Die d6 = new Die(6);
		System.out.println(d6.roll());
	}
	
	

}
