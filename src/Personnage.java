
public class Personnage {
	
	private String nom;
	byte age;
	
	public Personnage(String _nom, byte _age) {
		this.nom = _nom;
		if(this.checkAge(_age)) 
		{
			this.age = _age;
		}
		else 
		{
			byte age = 18;
			this.age = age;
		}
		this.age = _age;
		
	}

	public void sayHello() {
		System.out.println("hello");
	}
	
	public String getNom() {
		return this.nom;
		
	}
	
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	
	public byte getAge() {
		return this.age;
		
	}
	
	public void setAge(byte _age) {
		this.age = _age;
	}
	
	private boolean checkAge(byte _age) {
		if(_age >= 18) {
			return true;
		}
		return false;
	}

}
