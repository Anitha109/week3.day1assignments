package org.system;


public class Desktop extends Computer{
	
	public static void main(String[] args) {
		//Creat object for Computer class
		Computer objComputer = new Computer();
		//Call the method from Computer class
		objComputer.computerModel();
		//Call the desktopSize method from same class
		desktopSize();
	}
	public static void desktopSize(){
		System.out.println("Printing from Desktop class");
	}
	

}
