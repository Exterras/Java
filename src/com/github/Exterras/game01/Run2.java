package com.github.Exterras.game01;

import java.util.Scanner;

public class Run2 {
	public static void main(String[] args) {
		String userHand="";
		String comHand="";
		int comNum;
		boolean ex = true;
		
		System.out.println("���� ���� �� ���ӿ� ���Ű��� ȯ���մϴ�.");
		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
		System.out.println("���Ḧ ���Ͻø� ���� �� �Է��ϼ���.");
		
		while(ex){
			Scanner s = new Scanner(System.in);
			userHand = s.nextLine();
			comNum = (int)((Math.random()*3)+1);
						
			if(comNum == 1){
				comHand = "����";
			} else if (comNum == 2){
				comHand = "����";
			} else if (comNum == 3){
				comHand = "��";
			} else {
				comHand = "������� �����ϴ�";
			}
			
		    if (userHand.equals("����")){
				if(comHand.equals("����")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("���̽��ϴ�.");
				} else if (comHand.equals("����")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("����� �й��ϼ̽��ϴ�.");
				} else if (comHand.equals("��")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("����� �¸��ϼ̽��ϴ�.");
				}
			} else if (userHand.equals("����")){
				if(comHand.equals("����")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("����� �¸��ϼ̽��ϴ�.");
				} else if (comHand.equals("����")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("���̽��ϴ�.");
				} else if (comHand.equals("��")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("����� �й��ϼ̽��ϴ�.");
				}
			} else if (userHand.equals("��")){
				if(comHand.equals("����")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("����� �й��ϼ̽��ϴ�.");
				} else if (comHand.equals("����")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("����� �¸��ϼ̽��ϴ�.");
				} else if (comHand.equals("��")){
					System.out.println("����� �� ���� "+userHand+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comHand+"�Դϴ�.");
					System.out.println("���̽��ϴ�.");
				}
			} else if(userHand.equals("����")){
				ex = false;
				System.out.println("����Ǿ����ϴ�");
			} else {
				System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
				System.out.println("���Ḧ ���Ͻø� ���� �� �Է��ϼ���.");
			}
		}
	}
}
