package jv2;

//예제5-9. 인터페이스 구현, 클래스 상속
interface PhoneInterface { //PhoneInterface 인터페이스 선언
	final int TIMEOUT = 10000; //상수 필드 선언
	void sendCall(); //추상 메소드
	void receiveCall(); //추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}
}

//PhoneInterface를 상속받는 MobilePhoneInterface
interface MobilePhoneInterface extends PhoneInterface { 
	void sendSMS(); //추상메소드
	void receiveSMS(); //추상메소드
}

interface MP3Interface { //MP3Interface 인터페이스 선언
	public void play(); //추상메소드
	public void stop(); //추상메소드
}

class PDA { //클래스 작성
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA//SmartPhone 클래스는 PDA를 상속받음
implements MobilePhoneInterface, MP3Interface { //MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현
	//MobilePhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() { //PhoneInterface에서 상속받은 메소드
		System.out.println("따르릉따르릉~~");
	}	
	@Override
	public void receiveCall() { //PhoneInterface에서 상속받은 메소드
		System.out.println("전화 왔어요.");
	}	
	@Override
	public void sendSMS() { //MobilePhoneInterface의 메소드
	System.out.println("문자갑니다.");
	}	
	@Override
	public void receiveSMS() { //MobilePhoneInterface의 메소드
	System.out.println("문자왔어요.");
	}
	
	// MP3Interface의 추상 메소드 구현
	@Override
	public void play() { //MP3의 메소드
	System.out.println("음악 연주합니다.");
	}
	
	@Override
	public void stop() { //MP3의 메소드
	System.out.println("음악 중단합니다.");
	}
	
	// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
	
public class InterfaceEx {
	public static void main(String[] args) {
	SmartPhone phone = new SmartPhone(); //Smartphone객체 phone 생성
	phone.printLogo(); //PhoneInterface의 디폴프메소드
	phone.sendCall(); //PhoneInterface의 추상메소드, Smartphone클래스에서 구현됨
	phone.play(); //MP3의 추상메소드, Smartphone에서 구현됨
	System.out.println("3과 5를 더하면 " +
		phone.calculate(3,5)); //Smartphone의 슈퍼클래스인 PDA에서 구현
	phone.schedule(); //Smartphone클래스에서 추가로 구현한 메소드
	}
}
