
public class Monster {
	private String name;
	private String treasureClass;
	private String type;
	private int level;


	public Monster(String s){	
		String[] inputs = s.split("\t");
		name = inputs[0];
		type = inputs[1];
		level = Integer.parseInt(inputs[2]);
		treasureClass = inputs[3];
	}

	
	public String getName(){
		return name;
	}
	
	public String getTreasureClass(){
		return treasureClass;
	}
}

