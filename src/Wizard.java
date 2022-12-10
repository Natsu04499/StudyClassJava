
public class Wizard extends PlayableClasse implements CommonActions{
	
	private int mana;
	Wizard(String _nom, byte _age, int _hp, int _str, int _wis, int _mana) 
	{
		super(_nom, _age, _hp, _str, _wis);
		this.mana = _mana;
	}
	
	public void spellcast(String _magic) {
		if(this.mana >= 2) {
			this.mana -= 2;
			System.out.println("Katon " + _magic);
		}
		else {
			System.out.println("Je suis a sec....");
		}
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return this.str + 2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm so fast BOIIII !");
	}
	
	public void boast() {
		System.out.println("Les coccinelles sont des coléoptères ! ");
	}
	
	

}
