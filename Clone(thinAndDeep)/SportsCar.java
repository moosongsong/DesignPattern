package Ŭ��_�ڹٺ�����466;

public class SportsCar extends CarForClone {//implements Cloneable �̰� ���� Ŭ�������� �ؼ� ���� �� �ʿ� ����
	private int maxSpeed;

	public SportsCar(String name, String color, int maxSpeed) {
		super(name, color);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "�̸�:"+name+"����:"+color+"�ִ�ӵ�:"+maxSpeed;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object temp = super.clone();
		SportsCar sc = (SportsCar)temp;
		sc.maxSpeed=this.maxSpeed;
		return sc;
	}
	
}
