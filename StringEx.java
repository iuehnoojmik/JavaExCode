public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "�� ���̴� " + a.length()); // ���ڿ��� ����(���� ����)
		System.out.println(a.contains("#")); // ���ڿ��� ���� ����, true
		
		a = a.concat(b); // ���ڿ� ����, a= C#,C++
		System.out.println(a);
		
		a = a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		
		a = a.replace("C#","Java"); // ���ڿ� ��ġ, a=Java,C++
		System.out.println(a);
		
		String s[] = a.split(","); // ���ڿ� �и�
		for (int i=0; i<s.length; i++)
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]); //s[0]=Java, s[1]=C++
		
		a = a.substring(5); // �ε��� 5���� ������ ���� ��Ʈ�� ����, a=C++
		System.out.println(a);
		
		char c = a.charAt(2); // �ε��� 2�� ���� ����, a=C++, c=+
		System.out.println(c);
	}
}
