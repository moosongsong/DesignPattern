package ���丮�޼ҵ�����;

public class PiizzaStore {
	private IngredientFactory factory;

	public void setFactory(IngredientFactory factory) {
		this.factory = factory;
	}
	
	public Pizza order() {
		System.out.println(factory+"���� ��� ����!");
		return new Pizza(factory.createDough(),factory.createSauce(),factory.createCheese());
	}
}
