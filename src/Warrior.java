
public class Warrior extends PlayableClasse implements CommonActions {
	
	private int stamina;
	Warrior(String _nom, byte _age, int _hp, int _str, int _wis, int _stamina){
		super(_nom, _age, _hp, _str, _wis);
		this.stamina = _stamina;
	}
	
	public void shout(String message) {
		if(this.stamina >= 1) {
			this.stamina -= 1;
		System.out.println("JE CRIEEEE " + message + " !!!!");
		System.out.println("Stamina :" + this.stamina);
		}
		else {
			System.out.println("J....Je...Argh");
		}
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return this.str * 2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Je ne suis pas très rapide...");
	}
	
	public void boast() {
		System.out.println("J'vais te buter ! ");
	}

}
