
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte age = 55;
		Warrior Chuck = new Warrior("Chuck", age,50,5,5,2);
		Wizard Merlin = new Wizard("Merlin", age,70,5,5,5);
		Rogue Rayan = new Rogue("Rayan", age,19,5,5,10);
		

		Chuck.shout("KAMEHAMEAAAAAAAAAAAA");
		Merlin.spellcast("Boule de feu suprême !");
		Rayan.Shadowspell("Manipulation des ombres");
		Chuck.shout("Kaioken");
		Merlin.spellcast("Dragon de feu !");
		Rayan.Shadowspell("Attaque par derrière");
		Chuck.shout("Rasengan");
		Merlin.spellcast("La daronne a Lenny la folle !");
		Rayan.Shadowspell("Invocation des ombres !");
		//Chuck.sayHello();
	}

}
