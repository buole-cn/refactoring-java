package refactoring;

public class First {

	public static void main(String[] args) {
		First me = new First();
		assert me.max(10, 1);
		assert !me.max(10, 10);
		assert !me.max(10, 50);
		System.out.println("All Pass!");
	}
	
	public boolean max(int a, int b) {
		return a > b;
	}
}
