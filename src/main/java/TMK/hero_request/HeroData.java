package TMK.hero_request;

import java.util.List;
import java.util.ArrayList;

public class HeroData{

	private static HeroData instance;
	private static List<Hero> heroDB;


	private HeroData(){
		heroDB = new ArrayList<Hero>();
		heroDB.add(new Hero(0, "Fantomex", "External nervous system, cybernect mind", "X_factor"));
		heroDB.add(new Hero(1, "Wolverine", "Advanced healing factor, adamantium claws", "X_factor"));
		heroDB.add(new Hero(2, "Deadpool", "Advanced healing factor", "X_factor"));
	}

	public static HeroData getInstance(){
		if(instance == null){
			instance = new HeroData();
		}

		return instance;
	}

	public Hero getHero(long id, String name){
		for (Hero hero : heroDB){
			if(id == hero.getId_hero()){
				return hero;
			}
			if(name.equals(hero.getName())){
				return hero;
			}
		}	
		return new Hero(-1, null, null, null);
	}

}
