package jv2;

//����5-1. Ŭ���� ��� �����
class Point{ //pointŬ����
	private int x,y; //point�� x,y ��ǥ
	public void set(int x, int y) { //x,y��ǥ�� set�ϴ� �Լ�
		//private���� ��ȣ�� ���ڵ鿡 ���������Ҽ� �ֵ��� ���ش�
		this.x=x; //�� Ŭ���� x,y�� ���� ��ü���۷���
		this.y=y;
	}
	
	public void showPoint() { //x,y��ǥ�� ����ϴ� �Լ�
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point { //point Ŭ������ ��ӹ޴� colorpointŬ���� 
	private String color; //����Ʈ�� ����
	public void setColor(String color) { //����Ʈ�� ������ set
		this.color=color;
	}
	
	public void showColorPoint() { 
		System.out.print(color); //����Ʈ�� ���� ���
		showPoint(); //����Ʈ�� ��ǥ���(pointŬ�������� ��ӹ���)
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p=new Point(); //point��ü p ����
		p.set(1, 2); //p�� x,y��ǥ�� set
		p.showPoint(); //p�� ��ǥ ���
		
		ColorPoint cp=new ColorPoint(); //colorpoint ��ü cp ����
		cp.set(3, 4); //cp�� ��ǥ set
		cp.setColor("red"); //cp�� ���� set
		cp.showColorPoint(); //cp�� ����� ��ǥ ���
	}

}
