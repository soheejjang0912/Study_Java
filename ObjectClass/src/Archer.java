
public class Archer {
	
	String name;
	String power;
	
	public Archer(String name, String power) { //생성자
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) {
		//매개변수 로 들어온 오브젝트라는 하나의 변수(obj)가 아쳐라는 인스턴스와 동일한지 비교
		Archer temp = (Archer) obj;
		if(name == temp.name && power == temp.power){
			return true;
		}
		else {
			return false;
		}
	}

}
