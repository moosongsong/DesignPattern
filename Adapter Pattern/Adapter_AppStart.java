package ���������_������;

public class Adapter_AppStart {

	public static void main(String[] args) {
		Duck [] ds = {
			new Duck(),new TurkeyLikeDuck()	
		};
		
		ds[0].quack();
		ds[1].quack();
	}

}
