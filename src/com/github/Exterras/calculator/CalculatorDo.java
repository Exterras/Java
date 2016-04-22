package com.github.Exterras.calculator;

public class CalculatorDo {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		while(true){
			if((cal.isExitFlag() == false)){
				return;
			} else {
				cal.play();	
			}
		}
	}
}
