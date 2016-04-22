package com.github.Exterras.calculator;

import java.util.Scanner;

public class Calculator {
			
	private void add(int a, int b){
		System.out.println(a+b);
	}
	
	private void minus(int a, int b){
		System.out.println(a-b);
	}
	
	private void multi(int a, int b){
		System.out.println(a*b);
	}
	
	private void inputCalculate(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("계산기입니다. 원하시는 연산을 선택하세요.");
		System.out.println("1. 덧셈"+"\t"+"2. 뺄셈"+"\t"+"3. 곱셈"+"\t");
		
		int inputOperator = s.nextInt();
		
		System.out.println("계산을 할 두 수를 입력하세요.");
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(inputOperator == 1){
			add(a,b);
		} else if(inputOperator == 2){
			minus(a,b);
		} else if(inputOperator == 3){
			multi(a,b);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}		
		
	}
	
	public void play(){
		inputCalculate();
	}
}
