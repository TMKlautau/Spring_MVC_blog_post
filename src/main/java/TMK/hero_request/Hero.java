package TMK.hero_request;

public class Hero{

	private  long id_hero;
	private  String name;
	private  String power;
	private  String team;

	public Hero(long id_hero, String name, String power, String team ){
		this.id_hero = id_hero;
		this.name = name;
		this.power = power;
		this.team = team;
	}

	public long getId_hero(){
		return this.id_hero;
	}

	public String getName(){
		return this.name;
	}

	public String getPower(){
		return this.power;
	}

	public String getTeam(){
		return this.team;
	}

}
