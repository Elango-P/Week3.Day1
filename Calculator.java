package week3.day1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		obj.add(7, 6);
		obj.add(9, 8, 9);
		obj.mul(4, 5);
		obj.mul(8, 4.205);
		obj.sub(5, 9);
		obj.sub(9.6, 8.5);
		obj.div(24, 8);
		obj.div(5, 2.5);

	}

	public void add(int i, int j) {
		// TODO Auto-generated method stub
		int k = i + j;
		System.out.println("Result of Add method1 is :" + k);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Result of Add method 2 is:" + d);
	}

	public void mul(int x, int y) {
		int z = x * y;
		System.out.println("Result of mul 1 is :" + z);
	}

	public void mul(int a, double b) {
		double c = (a * b);
		System.out.println("Result of mul 2 is :" + c);

	}

	public void sub(int p, int q) {
		int r = p - q;
		System.out.println("Result of sub 1 is:" + r);
	}

	public void sub(double x, double y) {
		double z = x - y;
		System.out.println("Result of sub 2 is:" + z);
	}

	public void div(int e, int f) {
		int g = e / f;
		System.out.println("Result of div 1 is :" + g);
	}

	public void div(int a, double b) {
		double c = a / b;
		System.out.println("Result of div 1 is :" + c);

	}
}
