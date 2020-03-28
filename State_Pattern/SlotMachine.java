
public class SlotMachine {

	boolean inCoin;
	boolean lever;

	public SlotMachine() {
		inCoin = false;
		lever = false;
	}

	public void coinInput() {
		if (inCoin == true) {
			System.out.println("������ �ѹ��� �ϳ��� ������ �����մϴ�.");
			return;
		}
		System.out.println("������ ���ԵǾ����ϴ�.");
		inCoin = true;
		lever = false;
	}

	public void turnTheLever() {
		if (inCoin == false) {
			System.out.println("�켱 ������ �־��ּ���.");
			return;
		}

		if (lever == true) {
			System.out.println("������ ����� �����Դϴ�.");
			return;
		}
		System.out.println("������ ���ϴ�.");
		lever = true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			;
		}
		inCoin = false;
		lever = false;
	}
}