package jv2;

//����5-9. �������̽� ����, Ŭ���� ���
interface PhoneInterface { //PhoneInterface �������̽� ����
	final int TIMEOUT = 10000; //��� �ʵ� ����
	void sendCall(); //�߻� �޼ҵ�
	void receiveCall(); //�߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}

//PhoneInterface�� ��ӹ޴� MobilePhoneInterface
interface MobilePhoneInterface extends PhoneInterface { 
	void sendSMS(); //�߻�޼ҵ�
	void receiveSMS(); //�߻�޼ҵ�
}

interface MP3Interface { //MP3Interface �������̽� ����
	public void play(); //�߻�޼ҵ�
	public void stop(); //�߻�޼ҵ�
}

class PDA { //Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA//SmartPhone Ŭ������ PDA�� ��ӹ���
implements MobilePhoneInterface, MP3Interface { //MobilePhoneInterface�� MP3Interface �������̽��� ����� �߻� �޼ҵ带 ��� ����
	//MobilePhoneInterface�� �߻� �޼ҵ� ����
	@Override
	public void sendCall() { //PhoneInterface���� ��ӹ��� �޼ҵ�
		System.out.println("������������~~");
	}	
	@Override
	public void receiveCall() { //PhoneInterface���� ��ӹ��� �޼ҵ�
		System.out.println("��ȭ �Ծ��.");
	}	
	@Override
	public void sendSMS() { //MobilePhoneInterface�� �޼ҵ�
	System.out.println("���ڰ��ϴ�.");
	}	
	@Override
	public void receiveSMS() { //MobilePhoneInterface�� �޼ҵ�
	System.out.println("���ڿԾ��.");
	}
	
	// MP3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() { //MP3�� �޼ҵ�
	System.out.println("���� �����մϴ�.");
	}
	
	@Override
	public void stop() { //MP3�� �޼ҵ�
	System.out.println("���� �ߴ��մϴ�.");
	}
	
	// �߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}
	
public class InterfaceEx {
	public static void main(String[] args) {
	SmartPhone phone = new SmartPhone(); //Smartphone��ü phone ����
	phone.printLogo(); //PhoneInterface�� �������޼ҵ�
	phone.sendCall(); //PhoneInterface�� �߻�޼ҵ�, SmartphoneŬ�������� ������
	phone.play(); //MP3�� �߻�޼ҵ�, Smartphone���� ������
	System.out.println("3�� 5�� ���ϸ� " +
		phone.calculate(3,5)); //Smartphone�� ����Ŭ������ PDA���� ����
	phone.schedule(); //SmartphoneŬ�������� �߰��� ������ �޼ҵ�
	}
}
