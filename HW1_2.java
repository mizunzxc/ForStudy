// 2016-10-03 201504022 �̼���
// ���� Ȩ��ũ1
import java.util.Scanner;
import java.math.*;
interface Shape{
	static final double PI=3.14159;//����� ����
	double area();//���̱��ϴ� �޼���
	double perimeter();// �ѷ����ϴ� �޼���
}
class Circle implements Shape{
	double radius;
	Circle(){
	}
	Circle(double radius){
		this.radius = radius;
	}
	public double area() {
		return radius*radius*PI;
	}
	public double perimeter() {
		return 2*PI*radius;
	}
}
class Square implements Shape{
	double side;
	Square(){
	}
	Square(double side){
		this.side = side;
	}
	public double area() {
		return side*side;
	}
	public double perimeter() {
		return 4*side;
	}
}
class Triangle implements Shape{
	double a, b, c, s;
	Triangle(){
	}
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		s = (a+b+c)/2;
	}
	public double area() {
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter() {
		return a+b+c;
	}
}
public class HW1_2 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================\n");
		System.out.println("�й� : 201504022\n");
		System.out.println("�̸� : �̼���\n");
		System.out.println("=====================\n");
		
		double a, b, c, radius, side;
		System.out.println("���� �������� �Է��ϼ���.");
		radius=scan.nextDouble();
		System.out.println("���簢���� �� ���� ���̸� �Է��ϼ���.");
		side=scan.nextDouble();
		System.out.println("�ﰢ���� a���� ���̸� �Է��ϼ���.");
		a=scan.nextDouble();
		System.out.println("�ﰢ���� b���� ���̸� �Է��ϼ���.");
		b=scan.nextDouble();
		System.out.println("�ﰢ���� c���� ���̸� �Է��ϼ���.");
		c=scan.nextDouble();
		Circle cir = new Circle(radius);
		Square squ = new Square(side);
		Triangle tri = new Triangle(a,b,c);
		System.out.println("��");
		System.out.println("���� :"+cir.area());
		System.out.println("�ѷ� :"+cir.perimeter());
		System.out.println("���簢��");
		System.out.println("���� :"+squ.area());
		System.out.println("�ѷ� :"+squ.perimeter());
		System.out.println("�ﰢ��");
		System.out.println("���� :"+tri.area());
		System.out.println("�ѷ� :"+tri.perimeter());
	}
}

