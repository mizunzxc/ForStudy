import java.util.Scanner;
import java.math.*;

public class HW1_3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================\n");
		System.out.println("�й� : 201504022\n");
		System.out.println("�̸� : �̼���\n");
		System.out.println("=====================\n");

		System.out.println("���� ���� �� ����!");
		int cho = 1;// ����ڰ� ������ ����
		int com;
		while (cho != 4) {
			System.out.println("���� �� ���� ���ּ���!");
			System.out.println("1. ���� 2. ���� 3. �� 4. ����");
			cho = scan.nextInt();
			com = Random(1, 3);// ��ǻ�Ͱ� ����� ����
			if(cho == 4){}//���� ���ý� ��ǻ�� ��� ����
			else if(com == 1){System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");}
			else if(com == 2){System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");}
			else{System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");}
			
			switch (cho) {
			case 1:// ����
				if(com == 1){
					System.out.println("�����ϴ�.");
				}
				else if(com == 2){
					System.out.println("�����ϴ�.");
				}
				else{
					System.out.println("�̰���ϴ�.");
				}
				break;
			case 2:// ����
				if(com == 2){
					System.out.println("�����ϴ�.");
				}
				else if(com == 3){
					System.out.println("�����ϴ�.");
				}
				else{
					System.out.println("�̰���ϴ�.");
				}
				break;
			case 3:// ��
				if(com == 3){
					System.out.println("�����ϴ�.");
				}
				else if(com == 1){
					System.out.println("�����ϴ�.");
				}
				else{
					System.out.println("�̰���ϴ�.");
				}
				break;
			case 4:// ����
				
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

	static int Random(int min, int max) {// min���� max������ �����߻��޼���
		return (int) (Math.random() * (max - min + 1) + min);
	}
}

// for(int i = 0; i < 10 ; i++)
// System.out.println((int)(Math.random()*2)+1);//�����