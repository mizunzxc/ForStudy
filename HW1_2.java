// 2016-10-03 201504022 이성은
// 객프 홈워크1
import java.util.Scanner;
import java.math.*;
interface Shape{
	static final double PI=3.14159;//상수값 파이
	double area();//넓이구하는 메서드
	double perimeter();// 둘레구하는 메서드
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
		System.out.println("학번 : 201504022\n");
		System.out.println("이름 : 이성은\n");
		System.out.println("=====================\n");
		
		double a, b, c, radius, side;
		System.out.println("원의 반지름을 입력하세요.");
		radius=scan.nextDouble();
		System.out.println("정사각형의 한 변의 길이를 입력하세요.");
		side=scan.nextDouble();
		System.out.println("삼각형의 a변의 길이를 입렵하세요.");
		a=scan.nextDouble();
		System.out.println("삼각형의 b변의 길이를 입렵하세요.");
		b=scan.nextDouble();
		System.out.println("삼각형의 c변의 길이를 입렵하세요.");
		c=scan.nextDouble();
		Circle cir = new Circle(radius);
		Square squ = new Square(side);
		Triangle tri = new Triangle(a,b,c);
		System.out.println("원");
		System.out.println("넓이 :"+cir.area());
		System.out.println("둘레 :"+cir.perimeter());
		System.out.println("정사각형");
		System.out.println("넓이 :"+squ.area());
		System.out.println("둘레 :"+squ.perimeter());
		System.out.println("삼각형");
		System.out.println("넓이 :"+tri.area());
		System.out.println("둘레 :"+tri.perimeter());
	}
}

