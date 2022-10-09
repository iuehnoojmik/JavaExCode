package jv2;

//예제 5-7. 추상클래스
abstract class Calculator { //추상클래스 Calculator
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator { //추상클래스 Calculator를 상속받는 서브클래스 GoolCalc, 추상클래스는 아님
	@Override
	public int add(int a, int b) { //추상 메소드 add 구현
	return a + b;
	}
	
	@Override
	public int subtract(int a, int b) { //추상 메소드 subtract 구현
	return a - b;
	}
	
	@Override
	public double average(int[] a) { //추상 메소드 average 구현
	double sum = 0;
	for (int i = 0; i <a.length; i++)
	sum += a[i];
	return sum/a.length;
	}
	
	public static void main(String [] args) {
	GoodCalc c = new GoodCalc(); //GoodCalc 객체 c 생성
	System.out.println(c.add(2,3)); ///추상메소드 add를 통하여 5를 출력
	System.out.println(c.subtract(2,3)); //추상메소드 subtract를 통하여 -1 출력
	System.out.println(c.average(new int [] { 2,3,4 })); //추상메소드 average를 통하여 3.0출력
	}
}
