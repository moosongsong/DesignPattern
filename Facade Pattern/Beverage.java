package Facade;

public abstract class Beverage {
	protected String name;
	protected int price;
	
	public Beverage(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void creator(boolean condiment) { //��� facade �̴�.
		boilWater();
		brew();
		pourInCup();
		if(condiment) {
			addCondiment();
		}
		
	}

	public void boilWater() {
		System.out.println(name+"(��)�� ���� �����̱�");
	}
	public void pourInCup() {
		System.out.println(name+"(��)�� �ſ� �����ϴ�.");
	}
	
	public abstract void brew();
	public abstract void addCondiment();
}
