
public class Armor {
	private String name;
	private String defense;
	private String strength;

	public Armor(String s){	
		String[] inputs = s.split("\t");
		name = inputs[0];
		defense = inputs[1];
		strength = inputs[2];
	}

	public String getName(){
		return name;
	}

	public String getDefense(){
		return this.defense;
	}
	
	public String getStrength(){
		return this.strength;
	}
}
