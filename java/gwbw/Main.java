package GwbwPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();

		while (true) {
			System.out.println("���������� ���α׷��Դϴ�.");
			System.out.println("(����) (����) (��)  �� �ϳ� �� �Է��ϼ���. (���ڸ� �Է��ϸ� ��)");
			System.out.print("�Է� : ");
			Computer pc = new Computer();
			/**
			 * user�� Ű����� ���� �Է¹ޱ�
			 */
			user.setInput(sc.nextLine());
			user.settingUser();
			if (user.getResult() != 3 && user.getResult() != 6 && user.getResult() != 9)
				break;

			/**
			 * pc�� rand���� �������ֱ�
			 */
			pc.randCom();

			/**
			 * user�� pc�� ���ؼ� ���������� play�ϱ�
			 */

			Play play = new Play(pc.getResult(), user.getResult());
			System.out.printf("com : %s, ", pc.cpuResult());
			play.doing();

			System.out.print("�ٽ� �Ͻðڽ��ϱ�? ( �ٽ� �Ϸ��� y, Y, yes, Yes�θ� ���) ");
			if ((play.reTry(sc.nextLine())) == false)
				break;

		}

	}

}
