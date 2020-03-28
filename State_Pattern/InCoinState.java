
public class InCoinState implements Coin_State {
	private Machine machine;

	public InCoinState(Machine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void inputCoin() {
		// TODO Auto-generated method stub
		System.out.println("������ �̹� ���ԵǾ����ϴ�. ������ �߰������� ���� �� �����ϴ�.");
	}

	@Override
	public void turnLever() {
		// TODO Auto-generated method stub
		System.out.println("������ ���Ƚ��ϴ�. ��ǰ�� ����������.");
		machine.setCurrentState(machine.getNotcoinState());
	}

}
