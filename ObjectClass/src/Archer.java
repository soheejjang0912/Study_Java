
public class Archer {
	
	String name;
	String power;
	
	public Archer(String name, String power) { //������
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) {
		//�Ű����� �� ���� ������Ʈ��� �ϳ��� ����(obj)�� ���Ķ�� �ν��Ͻ��� �������� ��
		Archer temp = (Archer) obj;
		if(name == temp.name && power == temp.power){
			return true;
		}
		else {
			return false;
		}
	}

}
