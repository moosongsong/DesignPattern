package Ŭ��_�ڹٺ�����466;

public abstract class CarForClone implements Cloneable {
	protected String name;
	protected String color;
	
	public abstract String toString();
	
	public CarForClone(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}
//	
//	@Override
//	public String toString() {
//		return "CarForClone [name=" + name + ", color=" + color + "]";
//	}

	public Object clone() throws CloneNotSupportedException{
		Object o =super.clone();//car�� ���� clone ��û�� ���Դ�.
		//�׷��� ������Ʈ�� ī�� �Ȱ��� �޸� Ȯ���ϰ� �� �ּҸ� objectŸ������ ��ȯ�ϴµ�
		//���� �ν��Ͻ��� car�̴�.
		CarForClone car = (CarForClone)o;
		car.name=this.name;// string �� ���ο� �� ������ �Ұ����ϹǷ� �̰� �̷������� �����ϸ� �ȴ�.
		car.color=this.color;
		return car;//object�� ��ĳ���� �Ǿ ��ȯ
	}
}
