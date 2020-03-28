
public class NotCoinState implements Coin_State {
	private Machine machine;

	public NotCoinState(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void inputCoin() {
		System.out.println("������ ���ԵǾ����ϴ�.");
		machine.setCurrentState(machine.getIncoinState());

	}

	@Override
	public void turnLever() {
		System.out.println("��ǰ�� ���� �� �����ϴ�. ������ �־��ּ���.");
	}

}
