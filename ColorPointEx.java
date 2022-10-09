package jv2;

//예제5-1. 클래스 상속 만들기
class Point{ //point클래스
	private int x,y; //point의 x,y 좌표
	public void set(int x, int y) { //x,y좌표를 set하는 함수
		//private으로 보호된 인자들에 간접접근할수 있도록 해준다
		this.x=x; //이 클래스 x,y에 대한 자체레퍼런스
		this.y=y;
	}
	
	public void showPoint() { //x,y좌표를 출력하는 함수
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point { //point 클래스를 상속받는 colorpoint클래스 
	private String color; //포인트의 색깔
	public void setColor(String color) { //포인트의 색깔을 set
		this.color=color;
	}
	
	public void showColorPoint() { 
		System.out.print(color); //포인트의 색깔 출력
		showPoint(); //포인트의 좌표출력(point클래스에서 상속받음)
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p=new Point(); //point객체 p 생성
		p.set(1, 2); //p의 x,y좌표를 set
		p.showPoint(); //p의 좌표 출력
		
		ColorPoint cp=new ColorPoint(); //colorpoint 객체 cp 생성
		cp.set(3, 4); //cp의 좌표 set
		cp.setColor("red"); //cp의 색깔 set
		cp.showColorPoint(); //cp의 색깔과 좌표 출력
	}

}
