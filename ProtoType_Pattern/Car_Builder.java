package ����_�ڹٺ�����_������Ÿ��;

public class Car_Builder {//�̱������� ����
	private Car car;//������Ÿ�� ��û�Ҷ� ���� ������ ���纻�� �ѱ�� ��.
	private static Car_Builder builder= null;
	
	//�ڵ����� ����� ���� ����
	private Car_Builder() {//new �Ұ�
		//���⼭ car�� ��������� �ڵ����� �ϳ��ۿ� ���� �ȵ�.
//		this.car= new Car("�ҳ�Ÿ", "����", 2500);
	}
	
	public static Car_Builder getBuilder() {
		if(builder==null) {
			builder= new Car_Builder();
		}
		builder.car = new Car("�ҳ�Ÿ", "����", 2500);
		return builder;
	}
	
	public Car_Builder setName(String name) {
		this.car.setName(name);
		return this;
	}
	
	public Car_Builder setColor(String color) {
		this.car.setColor(color);
		return this;
	}
	
	public Car_Builder setDisp(int disp) {
		this.car.setDisp(disp);
		return this;
	}
	
	public Car getInstance() {
		return new Car(car.getName(), car.getColor(), car.getDisp());
//		return new Car(car);//�ָ��ϱ� ������ ����� ����.
	}
	
}
