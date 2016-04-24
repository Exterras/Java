package com.github.Exterras.calculator;

import java.util.Scanner;

public class Calculator {
	
	private boolean isExit = true;
	private int inputOperator;
	
	private void printAdd(int a, int b) {
		System.out.println(a + b);
	}

	private void printMinus(int a, int b) {
		System.out.println(a - b);
	}

	private void printMulti(int a, int b) {
		System.out.println(a * b);
	}
	
	public boolean isExit() {
		return isExit;
	}
	
	private void setExit(boolean isExit) {
		this.isExit = isExit;
	}
	
	private void inputOperMassage(){
		if (inputOperator == 1) {
			System.out.println("덧셈을 할 두 수를 입력하세요.");
		} else if (inputOperator == 2) {
			System.out.println("뺄셈을 할 두 수를 입력하세요.");
		} else if (inputOperator == 3) {
			System.out.println("곱셈을 할 두 수를 입력하세요.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public boolean play() {
		Scanner s = new Scanner(System.in);

		System.out.println("계산기입니다. 원하시는 연산을 선택하세요.");
		System.out.println("1. 덧셈" + "\t" + "2. 뺄셈" + "\t" + "3. 곱셈" + "\t" + "4. 종료");

		inputOperator = s.nextInt();
		
		if (inputOperator == 4) {
			System.out.println("계산기를 종료합니다.");
			setExit(false); 
			/* field isExit = false; -> CalculatorDo while else -> break;
			-> CalculatorDo All Completed -> terminated */
			return false;
			// public boolean play() return false -> terminated.
		}
		
		inputOperMassage();
		
		int inputNum1 = s.nextInt();
		int inputNum2 = s.nextInt();
		
		if (inputOperator == 1) {
			printAdd(inputNum1, inputNum2);
		} else if (inputOperator == 2) {
			printMinus(inputNum1, inputNum2);
		} else if (inputOperator == 3) {
			printMulti(inputNum1, inputNum2);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		return false;
	}
	// All Method Completed. -> Calculator terminated. 
}