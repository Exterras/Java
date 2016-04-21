package com.github.Exterras.game01;

import java.util.Scanner;

public class Run6Service {
	String userHand;
	String comHand;

	int comNum;
	int win;
	int lose;
	int draw;
	
	boolean ex;
	
	public Run6Service(){
		userHand = "";
		comHand = "";

		comNum = 0;
		win = 0;
		lose = 0;
		draw = 0;
		ex = true;
	}
	
	public void runWhile(){
		while (ex) {
			Scanner s = new Scanner(System.in);
			userHand = s.nextLine();
			comNum = (int) ((Math.random() * 3) + 1);

			int sum = win + draw + lose;
			double winAvg = Math.round(((double) win / (double) sum) * 100);

			if (comNum == 1) {
				comHand = "����";
			} else if (comNum == 2) {
				comHand = "����";
			} else if (comNum == 3) {
				comHand = "��";
			}

			if (userHand.equals("����") || userHand.equals("����") || userHand.equals("��")) {

			} else if (userHand.equals("����")) {
				ex = false;
				System.out.println("����Ǿ����ϴ�.");
				System.out.println("����� ������ �� Ƚ���� : " + sum + "ȸ �Դϴ�.");
				System.out.println("����� �·��� : " + winAvg + "% �Դϴ�.");
				System.out.println("����� ������ " + win + "�� " + draw + "�� " + lose + "�� " + "�Դϴ�.");
				continue;
			} else {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
				System.out.println("���Ḧ ���Ͻø� ���� �� �Է��ϼ���.");
				continue;
			}

			System.out.println("����� �� ���� " + userHand + "�Դϴ�.");
			System.out.println("��ǻ�Ͱ� �� ���� " + comHand + "�Դϴ�.");

			if (userHand.equals("����")) {
				if (comHand.equals("����")) { drawFunc(); } 
				else if (comHand.equals("����")) { loseFunc(); } 
				else if (comHand.equals("��")) { winFunc(); }
			} else if (userHand.equals("����")) {
				if (comHand.equals("����")) { winFunc(); } 
				else if (comHand.equals("����")) { drawFunc(); } 
				else if (comHand.equals("��")) { loseFunc(); }
			} else if (userHand.equals("��")) {
				if (comHand.equals("����")) { loseFunc(); } 
				else if (comHand.equals("����")) { winFunc(); } 
				else if (comHand.equals("��")) { drawFunc(); }
			}
			System.out.println("����� ������ " + win + "�� " + draw + "�� " + lose + "�� " + "�Դϴ�.");
		}
	}
	
	public void winFunc() {
		System.out.println("����� �¸��ϼ̽��ϴ�."); win++;
	}

	public void drawFunc() {
		System.out.println("���̽��ϴ�."); draw++;
	}

	public void loseFunc() {
		System.out.println("����� �й��ϼ̽��ϴ�."); lose++;
	}
}
