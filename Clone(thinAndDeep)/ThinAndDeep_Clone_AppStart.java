package Ŭ��_�ڹٺ�����466;
//thin copy = thin clone
public class ThinAndDeep_Clone_AppStart {
	public static void func(int [] ary) {
		ary[2]=10;
		ary[4]=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] f=new int[] {1,2,3,4,5};
		func(f);
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);//���� �ν��Ͻ��� ����Ų��.
		}
		
		CarForClone c =new SportsCar("����", "����", 250);
		SportsCar newCar = null;
		
		try {
			newCar = (SportsCar)((SportsCar)c).clone();
			newCar.setMaxSpeed(30000);
		} catch (CloneNotSupportedException e) {
			System.out.println("������ �������� �ʴ� ��ü�Դϴ�.");
			e.printStackTrace();//JVM���� clone �� �� �ִ� ��ü���� ������������.
			//cloneable�� implement�Ͽ� ������.
			//this instanceof Cloneable
		}
		System.out.println(c);
		System.out.println(newCar);
//		
//		c.setColor("white");
//		c.setName("lolo");
//		System.out.println(c);
//		System.out.println(newCar);
		
	}
	

}
