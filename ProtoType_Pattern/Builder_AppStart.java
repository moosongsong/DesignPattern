package ����_�ڹٺ�����_������Ÿ��;
//page 514
public class Builder_AppStart {

	public static void main(String[] args) {
		Car car = new Car("meme", "red", 5000);//�μ��� ���� �Ǹ� �μ��� ������ ȥ���� �� �ִ�.
		//�μ��� ������ �´� �ϴ���, �־����� ���� Ʋ������ �ִ�.���� �̸� ���� ���� �ƴ� ���� �̸���
		//��ü�� �����ϴ� ���� �־ cost�� ���� ���.
		//������ ��� ��� �����ϰ� ��ü�� �����ϴ� ���� ���� �����̴�. �� ��Ʈ�� ���۰� 
		//���� ������ ������ ���̶�� ���� �ȴ�.
		
		System.out.println(car);
		
//		Car_Builder cb = new Car_Builder();//ù��° ���
//		cb.setName("doll")
//		.setColor("blue")
//		.setDisp(1000);
		
		Car_Builder cb = Car_Builder.getBuilder();//2-1
		cb.setName("doll")
		.setColor("blue")
		.setDisp(1000);
		
		Car car1 = Car_Builder.getBuilder()//2-2
		.setName("dl")
		.setColor("skyblue")
		.setDisp(1000).getInstance();
		
		Car car2 = cb.setName("doll")//�ι�° ���
				.setColor("blue")
				.setDisp(1000).getInstance();
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
	}

}
