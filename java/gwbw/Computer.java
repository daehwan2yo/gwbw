package GwbwPackage;

import java.util.Random;

public class Computer extends GwbwParents {
	Random rand = new Random();

	public Computer() {
		setResult(0);
	}

	public void randCom() {
		setResult(rand.nextInt(10));
		if (0 < getResult() && getResult() < 4)
			setResult(3);
		else if (3 < getResult() && getResult() < 7)
			setResult(6);
		else if (6 < getResult() && getResult() < 10)
			setResult(9);
		else
			System.out.println("com객체 randCom() 오류");
	}

	public String cpuResult() {
		if (getResult() == 3)
			return "가위";
		else if (getResult() == 6)
			return "바위";
		else
			return "보";
	}

}
