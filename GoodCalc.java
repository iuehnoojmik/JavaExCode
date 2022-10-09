package jv2;

//���� 5-7. �߻�Ŭ����
abstract class Calculator { //�߻�Ŭ���� Calculator
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator { //�߻�Ŭ���� Calculator�� ��ӹ޴� ����Ŭ���� GoolCalc, �߻�Ŭ������ �ƴ�
	@Override
	public int add(int a, int b) { //�߻� �޼ҵ� add ����
	return a + b;
	}
	
	@Override
	public int subtract(int a, int b) { //�߻� �޼ҵ� subtract ����
	return a - b;
	}
	
	@Override
	public double average(int[] a) { //�߻� �޼ҵ� average ����
	double sum = 0;
	for (int i = 0; i <a.length; i++)
	sum += a[i];
	return sum/a.length;
	}
	
	public static void main(String [] args) {
	GoodCalc c = new GoodCalc(); //GoodCalc ��ü c ����
	System.out.println(c.add(2,3)); ///�߻�޼ҵ� add�� ���Ͽ� 5�� ���
	System.out.println(c.subtract(2,3)); //�߻�޼ҵ� subtract�� ���Ͽ� -1 ���
	System.out.println(c.average(new int [] { 2,3,4 })); //�߻�޼ҵ� average�� ���Ͽ� 3.0���
	}
}
