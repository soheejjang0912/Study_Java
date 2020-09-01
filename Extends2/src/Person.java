
public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
	
	//보안을 위해 각각의 변수에 접근할수 있는 메소드를 만든다. //소스 겟셋
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//생성자 : 하나의 인스턴스를 만들때 그 인스턴스가 가지는 변수들을 한번에 초기화 해줌 
	public Person(String name, int age, int height, int weight) {
		super(); //자신의 부모클래스의 생성자를 실행하겠다
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
