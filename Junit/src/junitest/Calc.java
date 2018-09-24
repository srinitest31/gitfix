package junitest;

 class Calc1 {
	int a,b;
	
	 double add(double i, double j ) {
		System.out.println(i+j);
		return i+j;
	}
	
	 double sub(double a, double b ) {
		System.out.println(a-b);
		return a-b;
	}
	
	 double mul(double a, double b ) {
		System.out.println(a*b);
		return a*b;
	}
	
	 double div(double a, double b ) {
		System.out.println(a/b);
		return a/b;
	}
	 
	 boolean add1(int a, int b) {
		 System.out.println(a+b);
		 return false;
	 }

}


public class Calc{
	public static void main(String[] args) {
		Calc1 ob=new Calc1();
		ob.add(5, 5);
	}
}