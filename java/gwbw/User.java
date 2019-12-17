package GwbwPackage;

public class User extends GwbwParents {
	private String input;

	public User() {
		input = null;
	}

	/**
	 * get, set설정
	 */

	public void setInput(String input) {
		this.input = input;
	}

	public void settingUser() {
		if (input.equals("가위")) {
			setResult(3);
		}

		else if (input.equals("바위") || input.equals("주먹")) {
			setResult(6);
		}

		else if (input.equals("보")) {
			setResult(9);
		}

		else {
			System.out.println("잘못 입력하셨습니다.");

		}
	}

}