// 2016-10-03 201504022 �̼���
// ���� Ȩ��ũ1

import java.util.Scanner;
public class HW1_1 {
	private static String cho;

	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		Order or = new Order();
		System.out.println("=====================\n");
		System.out.println("�й� : 201504022\n");
		System.out.println("�̸� : �̼���\n");
		System.out.println("=====================\n");
		
		System.out.println("��ǰ�� ������ �����ּ���.");
		or.setPrice("com", 0);
		or.setPrice("phone", 0);
		or.setPrice("tv", 0);
		String cho = null;
		do{
			or.Result(0, 0);
			cho = scan.next();
		}while(cho.equalsIgnoreCase("y"));//y�Է� �� ����
		System.out.println("���α׷��� �����մϴ�.");
	}
}

class Order{
	Scanner scan = new Scanner(System.in);
	int com_price;
	int phone_price;
	int tv_price;
	int cost;
	String item;
	void setPrice(String item, int price){//������ ���ϴ� �޼���
		if (item.equalsIgnoreCase("com")){
			System.out.println("��ǻ�� :");
			price = scan.nextInt();
			com_price = price;
		}
		else if(item.equalsIgnoreCase("phone")){
			System.out.println("�ڵ��� :");
			price = scan.nextInt();
			phone_price = price;
		}
		else if(item.equalsIgnoreCase("tv")){
			System.out.println("TV :");
			price = scan.nextInt();
			tv_price = price;
		}
	}
	void showMenu(){//������ ������ �����ִ� �޼���
		System.out.println("��ǰ�� �����ϼ���");
		System.out.println("1. ��ǻ�� : "+com_price);
		System.out.println("2. �ڵ��� : "+phone_price);
		System.out.println("3. tv : "+tv_price);
	}
	void Result(int money, int menu){//������ ��ǰ�� ���缭 ����� ������ִ� �޼���
		System.out.println("���� �Է����ּ���.");
		money = scan.nextInt();
		showMenu();
		menu = scan.nextInt();
		switch (menu) {
		case 1://��ǻ��
			System.out.println("������ ��ǰ�� ��ǻ���Դϴ�.");
			if(money-com_price>=0){
				System.out.println("�������� "+(money-com_price)+"�� �Դϴ�.");
			}else{
				System.out.println("���� �����մϴ�.");
			}
			break;
		case 2://�ڵ���
			System.out.println("������ ��ǰ�� �ڵ����Դϴ�.");
			if(money-phone_price>=0){
				System.out.println("�������� "+(money-phone_price)+"�� �Դϴ�.");
			}else{
				System.out.println("���� �����մϴ�.");
			}
			break;
		case 3://TV
			System.out.println("������ ��ǰ�� tv�Դϴ�.");
			if(money-tv_price>=0){
				System.out.println("�������� "+(money-tv_price)+"�� �Դϴ�.");
			}else{
				System.out.println("���� �����մϴ�.");
			}
			break;
		default://�̿��� ��
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		System.out.println("����Ͻðڽ��ϱ�? (\"y\"�Է½� ����ϱ�)");
	}
}