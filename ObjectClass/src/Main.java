
public class Main {

	public static void main(String[] args) {

		Archer archer1 = new Archer("�ü�1", "��");
		Archer archer2 = new Archer("�ü�2", "��");
		Archer archer3 = new Archer("�ü�2", "��");

		System.out.println(archer1 == archer2);
		System.out.println(archer3 == archer2); //�� �� ������ �ΰ��� �ٸ� �ν��Ͻ�

		System.out.println(archer3.equals(archer2));
	}

}
