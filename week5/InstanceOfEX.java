package jv2;

//InstanceOf 예제
class Person{}
class Student extends Person{} //Person-Student
class Researcher extends Person{}
class Professor extends Researcher{} //Person-Researcher-Professor

public class InstanceOfEX {
	
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student()->\t");
		print(new Student()); //Student 객체는 Person 타입이기도 해서 Person과 Student 출력
		//Person p=new Student 컴파일러가 자동 생성
		System.out.print("new Researcher()->\t");
		print(new Researcher()); //Researcher 객체는 Person 타입이기도 해서 Person과 Researcher 출력
		//Person p=new Researcher 컴파일러가 자동 생성
		System.out.print("new Professor()->\t");
		print(new Professor()); //Professor 객체는 Researcher타입이면서 Person타입이므로 Person과 Researhcer Professor 출력
		//Person p=new Professor 컴파일러가 자동 생성	
	}
}
