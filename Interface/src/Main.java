
public class Main implements Dog, Cat{ //���߻�� ���� �߻󿡼��� �ȵ�

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();
		
	}

	@Override
	public void crying() {
		System.out.println("����");
	}

	@Override
	public void show() {
		System.out.println("HELLO WORLD");
	}

	@Override
	public void two() {
		System.out.println("TWO");
		
	}

	@Override
	public void one() {
		System.out.println("ONE");
		
	}

}
