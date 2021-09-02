package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100]; // 크기가 100인 배열
		int count = 0; // 음식의 개수

		System.out.println("먹고 싶은 음식이 뭐에요?");
		System.out.println("입력만 한번 해보세요");

		while (true) {

			System.out.print(">");
			String menu = scan.nextLine(); // 공백도 포함해서 받습니다.

			if (menu.equals("그만"))
				break; // 문자비교는 == 비교가 안됨
						// 문자.equals("문자") 로 비교함

			arr[count] = menu; // arr[인덱스] = menu;
			count++;

		}

//		System.out.println(Arrays.toString(arr)); // 반복문으로 돌려서 찍어야함
// 		밑에 문장들이 Arrays.toString() 만드는 방법이라고 합니다..
		
		System.out.print("먹고싶은 음식:[");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]);
			if (i == count - 1)
				break;
			System.out.print(", ");
		}
		System.out.println("]");
		scan.close();
		
	}
}
