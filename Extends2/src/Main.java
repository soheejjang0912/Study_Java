import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�?");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		for(int i=0; i<number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String sutdentID;
			int grade;
			double gPA;
			System.out.println("�л��� �̸��� �Է��ϼ���");
			name = scan.next();
			System.out.println("�л��� ������ �Է��ϼ���");
			age = scan.nextInt();
			System.out.println("�л��� Ű�� �Է��ϼ���");
			height = scan.nextInt();
			System.out.println("�л��� ������ �Է��ϼ���");
			weight = scan.nextInt();
			System.out.println("�л��� �й��� �Է��ϼ���");
			sutdentID = scan.next();
			System.out.println("�л��� �г��� �Է��ϼ���");
			grade = scan.nextInt();
			System.out.println("�л��� ������ �Է��ϼ���");
			gPA = scan.nextDouble();
			
			students[i] = new Student(name, age,  height, weight, sutdentID, grade, gPA);
		}
		for(int i = 0; i < number; i++) {
			students[i].show();	
		}
		/*
		 * for(int i = 0; i<100; i++) { student[i] = new Student("ȫ�浿", 20, 175, 70,
		 * i+"", 1, 4.5); student[i].show(); }
		 * 
		 * Teacher teacher1 = new Teacher("����ȣ", 20, 140, 40, "11", 130, 3);
		 * teacher1.show();
		 */
		
	}

}
