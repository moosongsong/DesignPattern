package ����_�ڹٺ�����_������Ÿ��;

public class Car {
	private String name;
	private String color;
	private int disp;
	
	public Car(String name, String color, int disp) {
		this.name = name;
		this.color = color;
		this.disp = disp;
	}
	
	public Car (Car car) {//��������� �ָ��ؼ� ��������
		this.name=car.name;
		this.color=car.color;
		this.disp=car.disp;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getDisp() {
		return disp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDisp(int disp) {
		this.disp = disp;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("����:"+name+"\n");
		sb.append("����:"+color+"\n");
		sb.append("��ⷮ:"+disp+"cc");
		return sb.toString();
	}	
}
