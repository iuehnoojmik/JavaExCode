package jv2;

//예제5-5. 메소드 오버라이딩, 다형성
class Shape { //슈퍼 클래스 Shape
	public Shape next; 
	public Shape() { next = null; }
	
	public void draw() { //draw()메소드 (오버라이딩 당할 메소드)
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { //슈퍼클래스Shape의 draw()메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { //슈퍼클래스Shape의 draw()메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { //슈퍼클래스Shape의 draw()메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	
	static void paint(Shape p) { //Shape 객체 p생성, paint함수 등록
		p.draw(); //p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 
				  // 동적 바인딩
		}
	
	public static void main(String[] args) {
		Line line = new Line(); //Line 클래스의 객체 line 생성
		paint(line); //동적바인딩된 Line멤버의 draw()호출 - Line 출력
		paint(new Shape());  //Shape p=new Shape, Shape의 draw()호출 - Shape 출력
		paint(new Line());  //Shape p=new Line, Shape에서 오버라이딩 된 Line의 draw() 호출 - Line 출력
		paint(new Rect());  //Shape p=new Rect, Shape에서 오버라이딩 된 Rect의 draw() 호출 - Rect 출력
		paint(new Circle());  //Shape p=new Circle, Shape에서 오버라이딩 된 Circle의 draw() 호출 - Circle 출력
	}
}
