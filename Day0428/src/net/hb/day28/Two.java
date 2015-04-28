package net.hb.day28;

import java.util.Scanner;



public class Two {

	public static void main(String[] args){
		System.out.println("Two.java");
		int age; //선언
		age = 23; //값대입=할당=assignment
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("나이입력? ");
		age=stdIn.nextInt();
		System.out.println("나이="+age);
		System.out.println("\n영수증출력 10:19 10:31");
		stdIn.close();
	}// main end
}//class end
