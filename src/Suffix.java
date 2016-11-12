import java.util.Random;

public class Suffix {
	private String name;
	private String effect;
	private int min;
	private int max;
	
	public Suffix(String s){
		String[] inputs = s.split("\t");
		name = inputs[0];
		effect = inputs[1];
		min = Integer.parseInt(inputs[2]);
		max = Integer.parseInt(inputs[3]);
	}
	
	public String getName(){
		return name;
		
	}
	
	public String getEffect(){
		return effect;
	}
	
	public int getStat(){
		Random rand = new Random();
		int ret = rand.nextInt(max-min);
		return min + ret;
	}

}