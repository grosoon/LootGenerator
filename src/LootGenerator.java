import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
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
	
	public static List<Armor> getArmors(File file) throws FileNotFoundException{
		Scanner in = new Scanner(file);
		List<Armor> ret = new ArrayList<Armor>();
		while(in.hasNext()){
			ret.add(new Armor(in.nextLine()));
		}
		in.close();
		return ret;
	}
	
	public static Monster pickMonster(List<Monster> monsters){
		Random rand = new Random();
		return monsters.get(rand.nextInt(monsters.size()));
	}
	
	public static TreasureClass fetchTreasureClass(Monster m, List<TreasureClass> classes){
		String name =  m.getTreasureClass();
		Iterator<TreasureClass> iter = classes.iterator();
		TreasureClass cur;
		while(iter.hasNext()){
			cur = iter.next();
			if(cur.getName().equals(name)){
				return cur;
			}
		}
		return null;
	}
	
	
	
	public static void main(String[] argc) throws FileNotFoundException  {
		File monster = new File("src/data/large/monstats.txt");
		List<Monster> list = getMonsters(monster);
		Monster m1 = list.get(0);
		System.out.println(m1.getName());
		System.out.println(m1.getTreasureClass());
		
	}
	

}
