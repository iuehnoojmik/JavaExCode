package jv2;

//InstanceOf ����
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
		print(new Student()); //Student ��ü�� Person Ÿ���̱⵵ �ؼ� Person�� Student ���
		//Person p=new Student �����Ϸ��� �ڵ� ����
		System.out.print("new Researcher()->\t");
		print(new Researcher()); //Researcher ��ü�� Person Ÿ���̱⵵ �ؼ� Person�� Researcher ���
		//Person p=new Researcher �����Ϸ��� �ڵ� ����
		System.out.print("new Professor()->\t");
		print(new Professor()); //Professor ��ü�� ResearcherŸ���̸鼭 PersonŸ���̹Ƿ� Person�� Researhcer Professor ���
		//Person p=new Professor �����Ϸ��� �ڵ� ����	
	}
}
