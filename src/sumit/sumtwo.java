package sumit;

import java.util.Scanner;

public class sumtwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ���� �Է��ϼ���.");
		String value = scanner.nextLine();
		String[] splitva = value.split(" ");
		int one = Integer.parseInt(splitva[0]);
		int two = Integer.parseInt(splitva[1]);
		//Ȥ��
		//one = scanner.next();
		//one = scanner.next();
//		System.out.println("�� ���� ���� "+(one+two)+"�Դϴ�.");
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.",one,two,one+two);
		//%d �������� ��Ÿ������ printf �������� �����
		
	}
}
