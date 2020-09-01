
public class Main implements Dog, Cat{ //다중상속 가능 추상에서는 안됨

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();
		
	}

	@Override
	public void crying() {
		System.out.println("월월");
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
