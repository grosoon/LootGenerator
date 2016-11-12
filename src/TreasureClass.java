import java.util.Random;

public class TreasureClass {
	private String name;
	private String[] items;
	
	
	public TreasureClass(String s){
		String[] inputs = s.split("\t");
		name = inputs[0];
		items = new String[3];
		for(int i = 0; i < 3; i++){
			items[i] = inputs[i+1];
		}
	}
	
	public String getName(){
		return name;
	}
	
	public String getRandomItem(){
		Random rand = new Random();
		return items[rand.nextInt(3)];
	}
	
	
}