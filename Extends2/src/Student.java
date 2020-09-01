
public class Student extends Person{

	private String sutdentID;
	private int grade;
	private double GPA;
	
	public String getSutdentID() {
		return sutdentID;
	}
	public void setSutdentID(String sutdentID) {
		this.sutdentID = sutdentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public Student(String name, int age, int height, int weight, String sutdentID, int grade, double gPA) {
		super(name, age, height, weight); //�ڽ��� �θ�Ŭ������ �����ڸ� �����ϰڴ�
		this.sutdentID = sutdentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("-------------------");
		System.out.println("�л� �̸� : " + getName());
		System.out.println("�л� ���� : " + getAge());
		System.out.println("�л� Ű : " + getHeight());
		System.out.println("�л� ������ : " + getWeight());
		System.out.println("�й� : " + getSutdentID());
		System.out.println("�г� : " + getGrade());
		System.out.println("���� : " + getGPA());
		
	}
	
}
