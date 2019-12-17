package GwbwPackage;

public class Play {
	int com, user;

	public Play(int com, int user) {
		this.com = com;
		this.user = user;
	}

	public void doing() {
		if (com == user)
			System.out.println("당신이 비김");
		else if (com > user)
			System.out.println("당신이 짐");
		else
			System.out.println("당신이 이김");

	}

	/**
	 * retry 여부
	 */

	public boolean reTry(String retry) {
		if (retry.equals("y") || retry.equals("Y") || retry.equals("YES") || retry.equals("yes")) {
			System.out.println("한번 더 !");
			return true;
		} else {
			System.out.println("끝.");
			return false;
		}
	}
}
