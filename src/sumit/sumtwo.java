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
		//혹은
		//one = scanner.next();
		//one = scanner.next();
//		System.out.println("두 수의 합은 "+(one+two)+"입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.",one,two,one+two);
		//%d 형식으로 나타내려면 printf 형식으로 써야함
		
	}
}
