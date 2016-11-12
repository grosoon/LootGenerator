import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LootGenerator {
	public static List<Monster> getMonsters(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<Monster> ret = new ArrayList<Monster>();
		while(in.hasNext()){
			ret.add(new Monster(in.nextLine()));
		}
		in.close();
		return ret;
	}
	
	public static List<TreasureClass> getTreasureClasses(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<TreasureClass> ret = new ArrayList<TreasureClass>();
		while(in.hasNext()){
			ret.add(new TreasureClass(in.nextLine()));
		}
		in.close();
		return ret;
	}
	
	public static void main(String[] argc) throws FileNotFoundException  {
		File monster = new File("src/data/large/monstats.txt");
		List<Monster> list = getMonsters(monster);
		Monster m1 = list.get(0);
		System.out.println(m1.getName());
		System.out.println(m1.getTreasureClass());
		
	}

}
