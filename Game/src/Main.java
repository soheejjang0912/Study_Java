
public class Main {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");
		
		for(int i = 0; i< heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) {
				//전사라면
				Warrior temp = (Warrior) heros[i]; //형 변환
				temp.grounCutting();
			}else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}else if(heros[i] instanceof Wizard) {
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
			
		}
	}
}
