package ����������_������;

public class Observer_App_Start {

	public static void main(String[] args) {
		WeatherData wc = new WeatherData();//���û1 ����
		WeatherData aa =new WeatherData();//��âû 2
		
		Observer sd = new StaticDisplayer();
		
		//�������� ���û�� �������
		wc.addObserver(sd);
//		aa.addObserver(sd);
		wc.setHumi(13);
		wc.setPres(20);
		wc.setTemp(20);
		wc.notifyObserver();
		
	}

}
