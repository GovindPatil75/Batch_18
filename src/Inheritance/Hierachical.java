package Inheritance;

public class Hierachical {

	public static void main(String[] args) {
		
		A2 a2=new A2();
		a2.m1();
		
		B2 b2 =new B2();
		b2.m1();
		b2.m2();
		
		C2 c2=new C2();
		c2.m1();
		c2.m3();
	}
}
// Parent Class A2
class A2{
	
	public void m1() {
		System.out.println("I am m1");
	}
}
// Child class B2 extends parent class A2
 class B2 extends A2{
	 
	 public void m2() {
		 System.out.println("I am m2");
	 }
 }
 // Child class C2 extends Parent Class A2
 class C2 extends A2{
	 
	 public void m3() {
		 System.out.println("I am m3");
	 }
 }