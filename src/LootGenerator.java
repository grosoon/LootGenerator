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
	
	public static List<Prefix> getPrefixes(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<Prefix> ret = new ArrayList<Prefix>();
		while(in.hasNext()){
			ret.add(new Prefix(in.nextLine()));
		}
		in.close();
		return ret;
	}
	
	public static List<Suffix> getSuffixes(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<Suffix> ret = new ArrayList<Suffix>();
		while(in.hasNext()){
			ret.add(new Suffix(in.nextLine()));
		}
		in.close();
		return ret;
	}
	

}
