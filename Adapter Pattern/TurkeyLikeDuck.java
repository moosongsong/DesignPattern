package ���������_������;

public class TurkeyLikeDuck extends Duck{
	private Turkey turkey;
	
	

	public TurkeyLikeDuck() {
		turkey = new Turkey();
	}



	@Override
	public void quack() {
		this.turkey.gobble();
	}
}
