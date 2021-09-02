package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	public static void main(String[] args) {

		// 배열의 변경
		// 입력 -> 있는지 없지 탐색 -> 변경

		Scanner scan = new Scanner(System.in);
		String[] arr = { "강타", "문희준", "토니안", "장우혁", "이재원" };

		System.out.print("수정할 별명을 입력하세요>");
		String name = scan.next();

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (name.equals(arr[i])) { // 수정할 학생이 있는 경우

				System.out.print("변경할이름을 작성하세요> ");
				String s = scan.next();
				arr[i] = s; // 밑에 arr[i] = scan.next(); 와 같다.
				flag = true; // flag = true였다는건 if문을 실행했다는 증거가 된다.

//				arr[i] = scan.next();

			}

		}

		// 결과 이결과를 반복해서 보고 싶으면 반복문에 넣어야함?
		if (flag) {
			System.out.println("이름이 정상 수정되었습니다!");
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("찾는 이름은 없습니다");
		}
		scan.close();
		
	}
}
