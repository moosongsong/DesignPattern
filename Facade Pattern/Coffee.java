package Facade;

public class Coffee extends Beverage{
	
	//
	private String subName = "����������";
	//
	
	private static String productName = "Ŀ��";
	private static int productPrice=1500;
	
	public Coffee() {
		super(productName, productPrice);
	}

	public static void setProductName(String productName) {
		Coffee.productName = productName;
	}

	public static void setProductPrice(int productPrice) {
		Coffee.productPrice = productPrice;
	}

	@Override
	public void brew() {
		System.out.println(name+"(��)�� �����ϴ�.");	
	}

	@Override
	public void addCondiment() {
		System.out.println(name+"�� ������ ÷���մϴ�.");	
		func();
	}
	
	public void func() {
		System.out.println(subName+"�ϼ�");
	}
}
