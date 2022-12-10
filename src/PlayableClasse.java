
public class PlayableClasse extends Personnage {
	
	protected int hp;
	protected int str;
	protected int wis;
	
	public PlayableClasse(String _nom, byte _age, int _hp, int _str, int _wis) {
		super(_nom, _age);
		this.hp = _hp;
		this.str = _str;
		this.wis = _wis;
	}
	
	public void boast() {
		System.out.println("Je me vante ! AHAHA");
	}

}
