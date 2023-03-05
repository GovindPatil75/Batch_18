package Inheritance;

public class Multilevel {

	public static void main(String[] args) {
		
		A1 a1=new A1();
		a1.m1();
		
		B1 b1=new B1();
		b1.m1();
		b1.m2();
		
		C1 c1=new C1();
		c1.m1();
		c1.m2();
		c1.m3();
		
	}
}
//Parent class A1
	class A1 {
		
		public void m1() {
			System.out.println("I am m1");
		}
	}
	
	//Child class B1 extends Parent class A1
	class B1 extends A1{
		
		public void m2() {
			System.out.println("I am m2");
		}
	}
	// Child class C1 extends Parent class B1
 class C1 extends B1{
	 
	 public void m3() {
		 System.out.println("I am m3");
	 }
	 
 }