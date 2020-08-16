package TMK.hero_request;

public class HeroRequest{

	private final long id_request;
	private final Hero hero_data;

	public HeroRequest(long id_request, Hero hero_data){
		this.id_request = id_request;		
		this.hero_data = hero_data;
	}

	public long getId_request(){
		return this.id_request;
	}

	public Hero getHero_data(){
		return this.hero_data;
	}
}
