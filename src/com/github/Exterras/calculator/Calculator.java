package com.github.Exterras.calculator;

import java.util.Scanner;

public class Calculator {

	private boolean isExit = true;
	// private int inputOperator;

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

	private boolean inputOperMassage(int inputOperator) {
		if (inputOperator == 1) {
			System.out.println("덧셈을 할 두 수를 입력하세요.");
		} else if (inputOperator == 2) {
			System.out.println("뺄셈을 할 두 수를 입력하세요.");
		} else if (inputOperator == 3) {
			System.out.println("곱셈을 할 두 수를 입력하세요.");
		} else if (inputOperator == 4) {
			System.out.println("계산기를 종료합니다.");
			// isExit = false;
			/* field isExit = false; -> CalculatorDo while else -> break; ->
			 * CalculatorDo All Completed -> terminated */
			return false;
			// public boolean play() return false -> terminated.
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		return true;
	}

	public void play() {
		Scanner s = new Scanner(System.in);
		int inputOperator;
		System.out.println("계산기입니다. 원하시는 연산을 선택하세요.");
		System.out.println("1. 덧셈" + "\t" + "2. 뺄셈" + "\t" + "3. 곱셈" + "\t" + "4. 종료");

		inputOperator = s.nextInt();

		/* if (inputOperator == 4) {
		 System.out.println("계산기를 종료합니다.");
		 isExit = false;
		  field isExit = false; -> CalculatorDo while else -> break;
		 -> CalculatorDo All Completed -> terminated 
		 return false;
		 // public boolean play() return false -> terminated.
		 }*/

		isExit = inputOperMassage(inputOperator);

		if (isExit) {
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
		}
	}
	// All Method Completed. -> Calculator terminated.
}