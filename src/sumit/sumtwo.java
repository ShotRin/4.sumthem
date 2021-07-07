package sumit;

import java.util.Scanner;

public class sumtwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("두 수를 입력하세요.");
		String value = scanner.nextLine();
		String[] splitva = value.split(" ");
		int one = Integer.parseInt(splitva[0]);
		int two = Integer.parseInt(splitva[1]);
		System.out.println("두 수의 합은 "+(one+two)+"입니다.");
	}
}
