package Ŀ�ǵ����Ͽ���;

public class Radio_PurpleBook {
	private int volume = 50;
	private boolean power = false;
	
	public void on() {
		power=true;
		System.out.println("Radio ����");
	}
	public void off() {
		power=false;
		System.out.println("Radio ��");
	}
	
	public void volumeUp() {
		volume=volume+1;
		System.out.println("volume Up:"+volume);
	}
	
	public void volumeDown() {
		volume=volume-1;
		System.out.println("volume Down:"+volume);
	}
}
