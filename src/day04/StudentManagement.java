package day04;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		// 무엇이 불편한가를 느껴보자.

		Scanner scan = new Scanner(System.in);

		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];

		int count = 0; // 사람수
		int index = -1; // 위치값

		while (true) {

			System.out.println("[정보]사람수: " + count + ", 현재위치: " + index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete 7.exit");
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();
			
			
			switch (menu) {
			case 1:
				/*
				 * 이름, 성별(f/m), 나이를 받아서 각가 배열에 저장. 사람수를 증가
				 */
				System.out.println("\n========고객정보 입력=========");
				System.out.print("이름>");
				nameList [count] = scan.next();
				System.out.print("성별>");
				genderList [count] = scan.next();
				System.out.print("나이>");
				ageList [count] = scan.nextInt();
				
				count++;
				
				
				System.out.println("=================");
				break;
			case 2:
				/*
				 * ex) index는 0이하로 내려 갈 수 없기 때문에, 0이하면 "정보가 없습니다" 그렇지 않으면 인덱스를 조정해서 이전정보를 출력해서
				 * 보여주면 됩니다.
				 */
				if(index <= 0) {
					System.out.println("이전 정보가 없습니다");
				} else {
					index++;
					System.out.printf("이름:%s, 성별:%s , 나이 :%d\n",nameList[index],genderList[index], ageList[index] );
				}
				System.out.println("===================");
				break;
			case 3:
				System.out.println("=====다음 고객정보=====");
				/*
				 * 다음 고객정보가 없는 조건을 생각해서 출력해주세여(index 와 count가 연관)
				 *  없는 조건이 index>
				 */
				if(index >= count-1) {
					System.out.println("다음 정보가 없습니다");
				} else {
					System.out.printf("이름:%s, 성별:%s , 나이 :%d\n",nameList[index],genderList[index], ageList[index] );
				}
				
				System.out.println("=======================");
				break;
			case 4:
				/*
				 * 현재 고객정보가 출력할 수 없는 조건을 생각해서 정보를 출력해주세요. ex) 사람수 5명인데 index가 5를 나타낸다면?? x
				 */
				if( index >= 0 && index < count) {
					System.out.printf("이름:%s, 성별:%s , 나이 :%d\n",nameList[index],genderList[index], ageList[index] );
				} else {
					System.out.println("현재 고객정보가 없습니다.");
				}
				break;
			case 5:
				/*
				 * 4번과 동일 현재 고객정보가 출력할 수 없는 조건을 생각해서 정보를 출력해주세요. 스캐너를 통해서 순서대로 이름, 성별, 나이를 입력받아서
				 * 현재위치값을 수정하면 됩니다.
				 */
				if(index >= 0 && index < count) {
					System.out.print("이름>");
					nameList [count] = scan.next();
					System.out.print("성별>");
					genderList[count] = scan.next();
					System.out.println("나이>");
					ageList [count] = scan.nextInt();
					
					System.out.println("정보가 수정완료 되었습니다.");
					
				} else {
					System.out.println("수정할 정보가 없습니다.");
				}
				break;
			case 6:
				/*
				 * 4번과 동일 현재위치에서 부터 사람수 가지 배열요소를 당겨서 덮어 씌웁니다. 삭제할 데이터가 없으면 "없습니다"를 출력하면 됩니다.
				 */
				break;
			case 7:
				// 루프의 탈출
				break;

			default:
				// 잘못 입력된 경우
				break;
			}

		}

	}
}
