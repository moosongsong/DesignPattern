package Singleton;

public class MyLady {
	//private static MyLady instance = new MyLady();//�̷��� ��ü�� �����!
	
	private static MyLady instance = null;//����Ҷ� ����ϱ� ������
	
//	static {
//		instance = new MyLady();
//	}// �̷��� �ᵵ��.
	private MyLady() {//������ �����. �̷��� ȣ�� ���������� �Ұ� -> Ŭ���� �޼ҵ� �̿��ؼ� ȣ��.
		
	}
	public static MyLady getInstance() {
		//return new MyLady();//�׷��� ��� �ٺ����� �ش��� �� �� ����.
		if(instance == null) {
			instance=new MyLady();
		}
		return instance;
	}
	
	public String toString() {//�̰� ��� ��ǥ! �������̵��ΰ�?
		return "�ʴ� ���� �ϳ� ���� �״�";
		//println, print ��� �޼ҵ��� ��ü�� �־����� ��쿡�� 
		//�־����� ��ü�� toString() �޼ҵ尡 ��ȯ�ϴ� ���� ����մϴ�.
		
	}
}
