// 2016-10-03 201504022 이성은
// 객프 홈워크1

import java.util.Scanner;
public class HW1_1 {
	private static String cho;

	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		Order or = new Order();
		System.out.println("=====================\n");
		System.out.println("학번 : 201504022\n");
		System.out.println("이름 : 이성은\n");
		System.out.println("=====================\n");
		
		System.out.println("상품의 가격을 정해주세요.");
		or.setPrice("com", 0);
		or.setPrice("phone", 0);
		or.setPrice("tv", 0);
		String cho = null;
		do{
			or.Result(0, 0);
			cho = scan.next();
		}while(cho.equalsIgnoreCase("y"));//y입력 시 루프
		System.out.println("프로그램을 종료합니다.");
	}
}

class Order{
	Scanner scan = new Scanner(System.in);
	int com_price;
	int phone_price;
	int tv_price;
	int cost;
	String item;
	void setPrice(String item, int price){//가격을 정하는 메서드
		if (item.equalsIgnoreCase("com")){
			System.out.println("컴퓨터 :");
			price = scan.nextInt();
			com_price = price;
		}
		else if(item.equalsIgnoreCase("phone")){
			System.out.println("핸드폰 :");
			price = scan.nextInt();
			phone_price = price;
		}
		else if(item.equalsIgnoreCase("tv")){
			System.out.println("TV :");
			price = scan.nextInt();
			tv_price = price;
		}
	}
	void showMenu(){//정해진 가격을 보여주는 메서드
		System.out.println("상품을 선택하세요");
		System.out.println("1. 컴퓨터 : "+com_price);
		System.out.println("2. 핸드폰 : "+phone_price);
		System.out.println("3. tv : "+tv_price);
	}
	void Result(int money, int menu){//선택한 제품에 맞춰서 결과를 출력해주는 메서드
		System.out.println("돈을 입력해주세요.");
		money = scan.nextInt();
		showMenu();
		menu = scan.nextInt();
		switch (menu) {
		case 1://컴퓨터
			System.out.println("선택한 상품은 컴퓨터입니다.");
			if(money-com_price>=0){
				System.out.println("남은돈은 "+(money-com_price)+"원 입니다.");
			}else{
				System.out.println("돈이 부족합니다.");
			}
			break;
		case 2://핸드폰
			System.out.println("선택한 상품은 핸드폰입니다.");
			if(money-phone_price>=0){
				System.out.println("남은돈은 "+(money-phone_price)+"원 입니다.");
			}else{
				System.out.println("돈이 부족합니다.");
			}
			break;
		case 3://TV
			System.out.println("선택한 상품은 tv입니다.");
			if(money-tv_price>=0){
				System.out.println("남은돈은 "+(money-tv_price)+"원 입니다.");
			}else{
				System.out.println("돈이 부족합니다.");
			}
			break;
		default://이외의 것
			System.out.println("잘못된 입력입니다.");
			break;
		}
		System.out.println("계속하시겠습니까? (\"y\"입력시 계속하기)");
	}
}