package jv2;

//����5-2. ��Ӱ��� Ŭ���� �� ��� ����
class Person { //����Ŭ���� person
	private int weight; //private ���
	int age; //����Ʈ ���
	protected int height; //protected ���
	public String name; //public ���
	public void setWeight(int weight) { //�ٸ� Ŭ������ private����� weight�� set �� �� �ְ� �Ѵ�
		this.weight = weight;
	}
	public int getWeight() { //�ٸ� Ŭ������ private����� weight���� get �� �� �ְ� �Ѵ�
		return weight; 
	}
}

class Student extends Person { //personŬ������ ��ӹ޴� ����Ŭ���� student
	public void set() {
		age = 30; //���� Ŭ������ ����Ʈ ����� ���� (���� ��Ű��)
		name = "ȫ�浿"; //���� Ŭ������ public ����� ����
		height = 175; //���� Ŭ������ protected ����� ����
	  //weight = 99; //����. ���� Ŭ������ private����� ���� �Ұ�
		setWeight(99); //����Ŭ������ private ��� weight�� setWeigh()�� ���� ����
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student(); //Student ��ü s ����
		s.set(); //��ü s�� ������� set�Ѵ�.
	}
}
