package GwbwPackage;

public class GwbwParents {
	/**
	 * gwbw : 구분하기 위한 변수 &리턴 할 값
	 */
	private int gwbw;

	/**
	 * 생성자
	 */
	public GwbwParents() {
	}

	/**
	 * get, set 만들기 input 은 가위인지바위인지보인지 구별하기위한 변수
	 */
	public int getResult() {
		return gwbw;
	}

	public void setResult(int input) {
		gwbw = input;
	}

}
