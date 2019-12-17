package GwbwPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();

		while (true) {
			System.out.println("가위바위보 프로그램입니다.");
			System.out.println("(가위) (바위) (보)  중 하나 를 입력하세요. (글자만 입력하면 됨)");
			System.out.print("입력 : ");
			Computer pc = new Computer();
			/**
			 * user값 키보드로 부터 입력받기
			 */
			user.setInput(sc.nextLine());
			user.settingUser();
			if (user.getResult() != 3 && user.getResult() != 6 && user.getResult() != 9)
				break;

			/**
			 * pc값 rand으로 추출해주기
			 */
			pc.randCom();

			/**
			 * user와 pc값 비교해서 가위바위보 play하기
			 */

			Play play = new Play(pc.getResult(), user.getResult());
			System.out.printf("com : %s, ", pc.cpuResult());
			play.doing();

			System.out.print("다시 하시겠습니까? ( 다시 하려면 y, Y, yes, Yes로만 대답) ");
			if ((play.reTry(sc.nextLine())) == false)
				break;

		}

	}

}
