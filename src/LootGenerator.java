import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LootGenerator {
	public List<Monster> getMonsters(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<Monster> ret = new ArrayList<Monster>();
		while(in.hasNext()){
			ret.add(new Monster(in.nextLine()));
		}
		
		return ret;
	}
	
	public List<TreasureClass> getTreasureClasses(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<TreasureClass> ret = new ArrayList<TreasureClass>();
		while(in.hasNext()){
			ret.add(new TreasureClass(in.nextLine()));
		}
		
		return ret;
	}
	

}
