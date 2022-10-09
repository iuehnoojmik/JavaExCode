package jv2;

//����5-5. �޼ҵ� �������̵�, ������
class Shape { //���� Ŭ���� Shape
	public Shape next; 
	public Shape() { next = null; }
	
	public void draw() { //draw()�޼ҵ� (�������̵� ���� �޼ҵ�)
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { //����Ŭ����Shape�� draw()�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { //����Ŭ����Shape�� draw()�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { //����Ŭ����Shape�� draw()�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	
	static void paint(Shape p) { //Shape ��ü p����, paint�Լ� ���
		p.draw(); //p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. 
				  // ���� ���ε�
		}
	
	public static void main(String[] args) {
		Line line = new Line(); //Line Ŭ������ ��ü line ����
		paint(line); //�������ε��� Line����� draw()ȣ�� - Line ���
		paint(new Shape());  //Shape p=new Shape, Shape�� draw()ȣ�� - Shape ���
		paint(new Line());  //Shape p=new Line, Shape���� �������̵� �� Line�� draw() ȣ�� - Line ���
		paint(new Rect());  //Shape p=new Rect, Shape���� �������̵� �� Rect�� draw() ȣ�� - Rect ���
		paint(new Circle());  //Shape p=new Circle, Shape���� �������̵� �� Circle�� draw() ȣ�� - Circle ���
	}
}
