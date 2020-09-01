
public class Main { 
	//public class Main extends Parent {
	//final을 Parent에서 사용했기 때문에 extends 못함

	public void show() { //오버라이딩 함수 재 정의
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {

		Main main = new Main();
		main.show();
		/*
		 * final int number = 10; //상수 설정 //number = 5; //final을 붙여서 오류가 남
		 * System.out.println(number);
		 */
		
	}

}

