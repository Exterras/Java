package com.github.Exterras.calculator;

import java.util.Scanner;

public class Calculator {
	
	private boolean exitFlag = true;
	
	private void printAdd(int a, int b) {
		System.out.println(a + b);
	}

	private void printMinus(int a, int b) {
		System.out.println(a - b);
	}

	private void printMulti(int a, int b) {
		System.out.println(a * b);
	}

	public void play() {
		Scanner s = new Scanner(System.in);

		System.out.println("계산기입니다. 원하시는 연산을 선택하세요.");
		System.out.println("1. 덧셈" + "\t" + "2. 뺄셈" + "\t" + "3. 곱셈" + "\t" + "4. 종료");

		int inputOperator = s.nextInt();
		
		if (inputOperator == 4) {
			System.out.println("계산기를 종료합니다.");
			setExitFlag(false);
			return;
		}

		System.out.println("계산을 할 두 수를 입력하세요.");
		int a = s.nextInt();
		int b = s.nextInt();

		if (inputOperator == 1) {
			printAdd(a, b);
		} else if (inputOperator == 2) {
			printMinus(a, b);
		} else if (inputOperator == 3) {
			printMulti(a, b);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public boolean isExitFlag() {
		return exitFlag;
	}

	public void setExitFlag(boolean exitFlag) {
		this.exitFlag = exitFlag;
	}
}
