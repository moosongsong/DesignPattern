package Facade;

public class Store {

	public Beverage order(String name, boolean condiment) {
		Beverage bv = null;
		switch (name) {
		case "Ŀ��":
			bv = new Coffee();
			break;
		case "ȫ��":
			bv = new RedTea();
			break;
		default:
			break;
		}
		
		if(bv != null) {
			bv.creator(condiment);
		}
		else {
			System.out.println(name+"��(��) �� �������� ��� ���");
		}
		return bv;
	}

}
