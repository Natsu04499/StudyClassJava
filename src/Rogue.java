
public class Rogue extends PlayableClasse implements CommonActions{
	
	int agi;
	public Rogue(String _nom, byte _age, int _hp, int _str, int _wis, int _agi) {
		super(_nom, _age, _hp, _str, _wis);
		this.agi = _agi;
	}
	
	public void Shadowspell(String _parole) {
		if(this.agi >= 3) {
			this.agi -= 4;
			System.out.println("Technique de l'ombre " + _parole);
		}
		else {
			System.out.println("Mon âme... Elle est corrompu...");
		}
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return this.str + 5;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Je suis plus rapide que ton ombre !");
	}
	
	public void boast() {
		System.out.println("Les êtres inférieurs que vous êtes ne peuvent pas me voir... ");
	}

}
