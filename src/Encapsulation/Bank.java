package Encapsulation;

public class Bank {

	public static void main(String[]args) {
		
		HDFC hdfc=new HDFC();
		hdfc.setBalance(20);
		
		System.out.println(hdfc.getBalance());
	}
}
