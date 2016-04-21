package com.github.Exterras.calculator;

import java.util.Scanner;

public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator(){
		
	}
			
	void add(int a, int b){
//		System.out.println("������ �� ���� �Է��ϼ���.");
		System.out.println(a+b);
	}
	
	void minus(int a, int b){
//		System.out.println("������ �� ���� �Է��ϼ���.");
		System.out.println(a-b);
	}
	
	void multi(int a, int b){
//		System.out.println("������ �� ���� �Է��ϼ���.");
		System.out.println(a*b);
	}
	
	void play(){
		System.out.println("������ �� ���� �Է��ϼ���.");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		add(a,b);
	}
}
