package Inheritance;

public class SingleLevel {

	public static void main(String[] args) {

		 A a=new A();
		 a.m1();

		 B b=new B();
		 b.m1();
		 b.m2();

	}
}
	// Parent class A
	class A {
		
		public void m1() {
			System.out.println("I am m1");
		}
	}
	
	//Child class B extends Parent class A
	class B extends A{
		
		public void m2() {
			System.out.println("I am m2");
		}
	}

