
public class Main {

	public static void main(String[] args) {

		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수2", "중");
		Archer archer3 = new Archer("궁수2", "중");

		System.out.println(archer1 == archer2);
		System.out.println(archer3 == archer2); //값 이 같더라도 두개는 다른 인스턴스

		System.out.println(archer3.equals(archer2));
	}

}
