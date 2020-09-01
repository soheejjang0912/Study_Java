
public class Node {
	//��ü���� ���α׷��� �⺻���� ����
	private int x; //�ܺο��� �ٲ� �� ����
	private int y;
	
	public int getX() { //�ܺο��� ������ �� �ְ�
		return x;
	}
	
	public void setX(int x) { //x�� �� ����
		this.x = x; //�ڽ��� ������ �ִ� �Ӽ��� �ٲپ��� �� this
		//���� ���� int x�� �־��ְڵ�
	}
	
	public int getY() { //�ܺο��� ������ �� �ְ�
		return y;
	}

	public void setY(int y) { //y�� �� ����
		this.y = y; 
	}
	
	public Node(int x, int y){//������ : ��ü�� ������� �� �ڵ����� ���� �־��ִ� , �ʱ�ȭ ���ִ� �ϳ��� �Լ� // Ŭ������ ������ �̸��� ����
		this.x = x;
		this.y = y;
	}

	public Node getCenter(Node other) { //�� �߾��� ������ ��ǥ�� �ޱ� 
		return new Node((this.x + other.getX())/2,(this.y + other.getY())/2);
	}
	
}
	
