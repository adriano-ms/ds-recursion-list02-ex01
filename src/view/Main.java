package view;

import java.util.Scanner;

import controller.MultiplyController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MultiplyController mc = new MultiplyController();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(mc.multiply(a, b));
		
		sc.close();
	}

}
