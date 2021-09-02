package day04;

import java.util.Scanner;

public class studentManagementTTA {
		public static void main(String[] args) {
			// 선생님 답변
			
			Scanner scan = new Scanner(System.in);

			String[] nameList = new String[100];
			String[] genderList = new String[100];
			int[] ageList = new int[100];

			int count = 0; // 사람수
			int index = -1; // 위치값
		
			while (true) {

				System.out.println("[정보]사람수: " + count + ", 현재위치: " + index);
				System.out.println("[메뉴]1.sertm, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete 7.exit");
				System.out.print("메뉴입력>");
				int menu = scan.nextInt();

				switch (menu) {
				case 1:
					/*
					 * 이름, 성별(f/m), 나이를 받아서 각가 배열에 저장. 사람수를 증가
					 */
					System.out.println("========고객 정보 입력=======");
					System.out.print("이름>");
					String name = scan.next();
					System.out.print("성별>");
					String gender = scan.next();
					System.out.print("나이>");
					int age = scan.nextInt();
					
					nameList[count] = name;
					genderList[count] = gender;
					ageList[count] = age;
					count++;
					
					System.out.println("================================");
					break;
				case 2:
					/*
					 * ex) index는 0이하로 내려 갈 수 없기 때문에, 0이하면 "정보가 없습니다" 그렇지 않으면 인덱스를 조정해서 이전정보를 출력해서
					 * 보여주면 됩니다.
					 */
					System.out.println("=========== 이전 고객 정보===========");
					if(index <= 0 ) {
						System.out.println("이전 정보가 없습니다");
					} else {
						index--; //감소
						System.out.println("이름:" + nameList[index]);
						System.out.println("성별:" + genderList[index]);
						System.out.println("나이:" + ageList[index]);
					}
					
					System.out.println("==========================");
					
					break;
				case 3:
					/*
					 * 다음 고객정보가 없는 조건을 생각해서 출력해주세여(index 와 count가 연관)
					 */
					System.out.println("=========다음 고객 정보============");
					if(index >= count -1 ) {
						System.out.println("다음 고객 정보가 없습니다");
					} else {
						index++;
						System.out.println("이름:" + nameList[index]);
						System.out.println("성별:" + genderList[index]);
						System.out.println("나이:" + ageList[index]);
					}

					System.out.println("=================================");
					
					break;
				case 4:
					/*
					 * 현재 고객정보가 출력할 수 없는 조건을 생각해서 정보를 출력해주세요. ex) 사람수 5명인데 index가 5를 나타낸다면?? x
					 */
					System.out.println("===========현재 고객 정보=============");
					if(index >= 0 && index <= count - 1) {
						System.out.println("이름:" + nameList[index]);
						System.out.println("성별:" + genderList[index]);
						System.out.println("나이:" + ageList[index]);
					} else {
						System.out.println("현재 정보가 없습니다. 위치를 이동해주세요");
					}
					
					System.out.println("=============================");
					
					break;
				case 5:
					/*
					 * 4번과 동일 현재 고객정보가 출력할 수 없는 조건을 생각해서 정보를 출력해주세요. 스캐너를 통해서 순서대로 이름, 성별, 나이를 입력받아서
					 * 현재위치값을 수정하면 됩니다.
					 */
					System.out.println("===========고객 정보 수정============");
					if(index >= 0 && index <= count -1) {
						System.out.println("수정할 정보를 입력하세요");
						System.out.print("수정전 정보 [" + nameList[index] + "]:");
						nameList[index] = scan.next();

						System.out.println("수정전 정보[" + genderList[index] + "]");
						genderList[index] = scan.next();
						
						System.out.println("수정전 정보[" + ageList[index] + "]");
						ageList[index] =scan.nextInt();
						
						System.out.println("수정처리 되었습니다");
						
					} else {
						System.out.println("수정할 정보가 없습니다. 위치를 이동해 주세요");
					}
					System.out.println("=================================");
					
					break;
				case 6:
					/*
					 * 4번과 동일 현재위치에서 부터 사람수 가지 배열요소를 당겨서 덮어 씌웁니다. 삭제할 데이터가 없으면 "없습니다"를 출력하면 됩니다.
					 */
					System.out.println("===========현재 정보 삭제==========");
					if(index >= 0 && index <= count -1) {
						System.out.println( nameList[index] + "님을 삭제합니다");
						for(int i = index; i < count -1; i++) {
							nameList[i] = nameList[i+1];
							genderList[i] = genderList[i+1];
							ageList[i] = ageList[i+1];
						}
						count--;
						
						} else {
							System.out.println("삭제할 정보가 없습니다 위치를 이동해주세요");
					
					}
					System.out.println("===============================");
					break;
				case 7:
					// 루프의 탈출
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
					
					break;

				default:
					// 잘못 입력된 경우
					System.out.println("메뉴번호를 확인해주세요");
					break;
				}

			}
			
		
	}
}
