package ���ڷ���������_������;

public class Coffee extends Beverage {
	
	public static final String PDNAME = "����������";
	public static final int PDCOST = 2000;

	public Coffee() {
		super(PDNAME, PDCOST);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", cost=" + cost + "]";
	}
	
}
