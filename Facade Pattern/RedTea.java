package Facade;

public class RedTea extends Beverage{
	private static String productName = "ȫ��";
	private static int productPrice=2500;
	
	public RedTea() {
		super(productName, productPrice);
	}

	public static void setProductName(String productName) {
		RedTea.productName = productName;
	}

	public static void setProductPrice(int productPrice) {
		RedTea.productPrice = productPrice;
	}

	@Override
	public void brew() {
		System.out.println(name+"��(��) �츳�ϴ�.");
	}

	@Override
	public void addCondiment() {
		System.out.println(name+"�� ������ ÷���մϴ�.");
	}
}
