package ���ڷ���������_������;

public class Beverage_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b =new Coffee();
		b = new Sugar(b);
		b=new Sugar(b);
		b=new Lemon(b);
		System.out.println(b.getName()+":"+b.getCost());
		//scanner, I/O Stream �� ���ڷ����� �������� ������� �ִ�.
		
		Beverage b1 = new Lemon(null);
		b1 = new Lemon(b1);
		System.out.println(b1.getName()+":"+b1.getCost());
	}

}
