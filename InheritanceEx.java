package jv2;

//예제5-2. 상속관계 클래스 간 멤버 접근
class Person { //슈퍼클래스 person
	private int weight; //private 멤버
	int age; //디폴트 멤버
	protected int height; //protected 멤버
	public String name; //public 멤버
	public void setWeight(int weight) { //다른 클래스가 private멤버인 weight를 set 할 수 있게 한다
		this.weight = weight;
	}
	public int getWeight() { //다른 클래스가 private멤버인 weight값을 get 할 수 있게 한다
		return weight; 
	}
}

class Student extends Person { //person클래스를 상속받는 서브클래스 student
	public void set() {
		age = 30; //슈퍼 클래스의 디폴트 멤버에 접근 (같은 패키지)
		name = "홍길동"; //슈퍼 클래스의 public 멤버에 접근
		height = 175; //슈퍼 클래스의 protected 멤버에 접근
	  //weight = 99; //오류. 슈퍼 클래스의 private멤버에 접근 불가
		setWeight(99); //슈퍼클래스의 private 멤버 weight에 setWeigh()로 간접 접근
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student(); //Student 객체 s 생성
		s.set(); //객체 s의 멤버들을 set한다.
	}
}
