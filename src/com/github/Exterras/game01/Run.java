package com.github.Exterras.game01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		int userNum;
		int comNum;
		boolean ex = true;
		
		System.out.println("���� ���� �� ���ӿ� ���Ű��� ȯ���մϴ�.");
		System.out.println("������ 1, ������ 2, ���� 3�� �����ּ���.");
		System.out.println("���� ��ư�� 4���Դϴ�.");
		
		while(ex){
			Scanner s = new Scanner(System.in);
			userNum = s.nextInt();
			
			if(userNum == 4){
				ex = false;
				System.out.println("����Ǿ����ϴ�");
			} else if (userNum < 1 || userNum > 4){
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println("������ 1, ������ 2, ���� 3�� �����ּ���.");
				System.out.println("���� ��ư�� 4���Դϴ�.");
			} else {
		
				comNum = (int)((Math.random()*3)+1);
				int result = ((userNum-comNum)+3)%3;
					
				if(result == 0){
					System.out.println("����� �� ���� "+userNum+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comNum+"�Դϴ�.");
					System.out.println("���̽��ϴ�.");
				} else if(result == 1){
					System.out.println("����� �� ���� "+userNum+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comNum+"�Դϴ�.");
					System.out.println("����� �¸��ϼ̽��ϴ�.");
				} else if(result == 2){
					System.out.println("����� �� ���� "+userNum+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� "+comNum+"�Դϴ�.");
					System.out.println("��ǻ�Ͱ� �й��ϼ̽��ϴ�.");
				}
			}
		}
	}
}

