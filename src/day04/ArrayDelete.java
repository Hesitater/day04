package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	public static void main(String[] args) {

		// 배열의특징 중 하나 크기가 고정이다. 지운다는 개념은 없다 덮어준다..?
		// 배열의 중간에 비우고(?) , 뒤에껄 하나씩 끌고오고 , 마지막배열을 막음으로써 지운 것 처럼 보이게
		// 배열에서 삭제는 없고 삭제 된것처럼 보여준다.

//		단면적으로

//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		//4번째 인덱스의 삭제를 표현
//		//마지막 인 10(인덱스11)에서 하나를 끌어올 그 뒤가 없다
//		
//		for(int i = 4; i < arr.length -1; i++ ) { //arr.length - 1 ; 대표적인 표현임
//			arr[i] = arr[i+1];
//			
//		}
//			
//		System.out.println(Arrays.toString(arr));

		// 별명입력 -> 탐색 -> 당겨오기

		Scanner scan = new Scanner(System.in);
		String[] arr = { "강타", "문희준", "이재원", "토니안", "장우혁" };

		System.out.print("삭제할 별명을 입력하세요>");
		String name = scan.next();

		int count = arr.length; // 사람수(변수화) 사람수가 변화함에따라 for문도 변해야하므로..
		boolean flag = false; // 삭제여부 확인하는 변수 (Yes or no를 표현하는 문법 중 하나)

		for (int i = 0; i < count; i++) {

			if (name.equals(arr[i])) { // 삭제할 사람을 찾은 경우
				System.out.println(name + "을 삭제합니다");

				// 뒤에 인덱스를 하나씩 당겨오기 중첩반복문을 이용
				for (int j = i; j < count - 1; j++) {
					arr[j] = arr[j + 1];

				}

				// 삭제의 의미
				count--;
				flag = true;
				// 동명 이인이 있다면 break;
			}

		} // end while

		// 결과
		if (flag) { // 삭제가 됨 // if문을 탔으면 flag = true가 된다 flag == true 도 사용 가능

			System.out.println("======삭제 후 정보=====");
			for (int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println("\n=================");

		} else {
			System.out.println("삭제 할 별명이 없습니다.");
		}
		scan.close();
		
	}
}
