package com.github.Exterras.game01;

import java.util.Scanner;

/**
 * @author exterra
 * @version ���������� 0.6
 * 
 */
public class Run4 {
	public static void main(String[] args) {
		String userHand = "";
		String comHand = "";

		int comNum;
		int win = 0;
		int lose = 0;
		int draw = 0;

		boolean ex = true;

		System.out.println("���� ���� �� ���ӿ� ���Ű��� ȯ���մϴ�.");
		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
		System.out.println("���Ḧ ���Ͻø� ���� �� �Է��ϼ���.");

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
			} else {
				comHand = "������� �����ϴ�";
			}
			
			if(userHand.equals("����") || userHand.equals("����") || userHand.equals("��")){
				
			}else if (userHand.equals("����")) {
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
				if (comHand.equals("����")) {
					System.out.println("���̽��ϴ�.");
					draw++;
				} else if (comHand.equals("����")) {
					System.out.println("����� �й��ϼ̽��ϴ�.");
					lose++;
				} else if (comHand.equals("��")) {
					System.out.println("����� �¸��ϼ̽��ϴ�.");
					win++;
				}
			} else if (userHand.equals("����")) {
				
				if (comHand.equals("����")) {
					System.out.println("����� �¸��ϼ̽��ϴ�.");
					win++;
				} else if (comHand.equals("����")) {
					System.out.println("���̽��ϴ�.");
					draw++;
				} else if (comHand.equals("��")) {
					System.out.println("����� �й��ϼ̽��ϴ�.");
					lose++;
				}	
			} else if (userHand.equals("��")) {
				
				if (comHand.equals("����")) {
					System.out.println("����� �й��ϼ̽��ϴ�.");
					lose++;
				} else if (comHand.equals("����")) {
					System.out.println("����� �¸��ϼ̽��ϴ�.");
					win++;
				} else if (comHand.equals("��")) {
					System.out.println("���̽��ϴ�.");
					draw++;
				}
			} 
			System.out.println("����� ������ " + win + "�� " + draw + "�� " + lose + "�� " + "�Դϴ�.");
			
			
		}
	}
}