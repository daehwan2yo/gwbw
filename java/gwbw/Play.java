package GwbwPackage;

public class Play {
	int com, user;

	public Play(int com, int user) {
		this.com = com;
		this.user = user;
	}

	public void doing() {
		if (com == user)
			System.out.println("����� ���");
		else if (com > user)
			System.out.println("����� ��");
		else
			System.out.println("����� �̱�");

	}

	/**
	 * retry ����
	 */

	public boolean reTry(String retry) {
		if (retry.equals("y") || retry.equals("Y") || retry.equals("YES") || retry.equals("yes")) {
			System.out.println("�ѹ� �� !");
			return true;
		} else {
			System.out.println("��.");
			return false;
		}
	}
}
