package com.github.Exterras.calculator;

import java.util.Scanner;

public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator(){
		
	}
			
	void add(int a, int b){
//		System.out.println("덧셈을 할 두 수를 입력하세요.");
		System.out.println(a+b);
	}
	
	void minus(int a, int b){
//		System.out.println("뺄셈을 할 두 수를 입력하세요.");
		System.out.println(a-b);
	}
	
	void multi(int a, int b){
//		System.out.println("곱셈을 할 두 수를 입력하세요.");
		System.out.println(a*b);
	}
	
	void ready(){
		System.out.println("곱셈을 할 두 수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
	}
	
	void play(){
		ready();
		multi(a,b);
	}
}
