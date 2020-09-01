
public class Node {
	//객체지향 프로그램의 기본적인 보안
	private int x; //외부에서 바꿀 수 없게
	private int y;
	
	public int getX() { //외부에서 접근할 수 있게
		return x;
	}
	
	public void setX(int x) { //x의 값 설정
		this.x = x; //자신이 가지고 있는 속성을 바꾸어줄 때 this
		//지금 들어온 int x를 넣어주겠따
	}
	
	public int getY() { //외부에서 접근할 수 있게
		return y;
	}

	public void setY(int y) { //y의 값 설정
		this.y = y; 
	}
	
	public Node(int x, int y){//생성자 : 객체를 만들어줄 때 자동으로 값을 넣어주는 , 초기화 해주는 하나의 함수 // 클래스와 동일한 이름을 가짐
		this.x = x;
		this.y = y;
	}

	public Node getCenter(Node other) { //정 중앙을 가지는 좌표를 받기 
		return new Node((this.x + other.getX())/2,(this.y + other.getY())/2);
	}
	
}
	
