import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇명의 학생이 존재합니까?");
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
			System.out.println("학생의 이름을 입력하세요");
			name = scan.next();
			System.out.println("학생의 나이을 입력하세요");
			age = scan.nextInt();
			System.out.println("학생의 키를 입력하세요");
			height = scan.nextInt();
			System.out.println("학생의 몸무게 입력하세요");
			weight = scan.nextInt();
			System.out.println("학생의 학번을 입력하세요");
			sutdentID = scan.next();
			System.out.println("학생의 학년을 입력하세요");
			grade = scan.nextInt();
			System.out.println("학생의 학점을 입력하세요");
			gPA = scan.nextDouble();
			
			students[i] = new Student(name, age,  height, weight, sutdentID, grade, gPA);
		}
		for(int i = 0; i < number; i++) {
			students[i].show();	
		}
		/*
		 * for(int i = 0; i<100; i++) { student[i] = new Student("홍길동", 20, 175, 70,
		 * i+"", 1, 4.5); student[i].show(); }
		 * 
		 * Teacher teacher1 = new Teacher("김태호", 20, 140, 40, "11", 130, 3);
		 * teacher1.show();
		 */
		
	}

}
