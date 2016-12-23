import java.util.Scanner;
import java.math.*;

public class HW1_3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================\n");
		System.out.println("학번 : 201504022\n");
		System.out.println("이름 : 이성은\n");
		System.out.println("=====================\n");

		System.out.println("가위 바위 보 게임!");
		int cho = 1;// 사용자가 선택할 변수
		int com;
		while (cho != 4) {
			System.out.println("다음 중 선택 해주세요!");
			System.out.println("1. 가위 2. 바위 3. 보 4. 종료");
			cho = scan.nextInt();
			com = Random(1, 3);// 컴퓨터가 사용할 변수
			if(cho == 4){}//종료 선택시 컴퓨터 결과 가림
			else if(com == 1){System.out.println("컴퓨터는 가위를 냈습니다.");}
			else if(com == 2){System.out.println("컴퓨터는 바위를 냈습니다.");}
			else{System.out.println("컴퓨터는 보를 냈습니다.");}
			
			switch (cho) {
			case 1:// 가위
				if(com == 1){
					System.out.println("비겼습니다.");
				}
				else if(com == 2){
					System.out.println("졌습니다.");
				}
				else{
					System.out.println("이겼습니다.");
				}
				break;
			case 2:// 바위
				if(com == 2){
					System.out.println("비겼습니다.");
				}
				else if(com == 3){
					System.out.println("졌습니다.");
				}
				else{
					System.out.println("이겼습니다.");
				}
				break;
			case 3:// 보
				if(com == 3){
					System.out.println("비겼습니다.");
				}
				else if(com == 1){
					System.out.println("졌습니다.");
				}
				else{
					System.out.println("이겼습니다.");
				}
				break;
			case 4:// 종료
				
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	static int Random(int min, int max) {// min부터 max까지의 난수발생메서드
		return (int) (Math.random() * (max - min + 1) + min);
	}
}

// for(int i = 0; i < 10 ; i++)
// System.out.println((int)(Math.random()*2)+1);//실험용