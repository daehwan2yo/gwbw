package GwbwPackage;

public class User extends GwbwParents {
	private String input;

	public User() {
		input = null;
	}

	/**
	 * get, set����
	 */

	public void setInput(String input) {
		this.input = input;
	}

	public void settingUser() {
		if (input.equals("����")) {
			setResult(3);
		}

		else if (input.equals("����") || input.equals("�ָ�")) {
			setResult(6);
		}

		else if (input.equals("��")) {
			setResult(9);
		}

		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		}
	}

}