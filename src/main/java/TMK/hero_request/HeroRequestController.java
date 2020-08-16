package TMK.hero_request;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@RestController
@Validated
public class HeroRequestController{
	
	private final AtomicLong requestCounter = new AtomicLong();
	private static HeroData heroData;


	@GetMapping("/HeroData")
	public HeroRequest HeroRequestController(@RequestParam(value="id", required=false) @Min(value=0, message="ID must be positive") Long id_requested
											,@RequestParam(value="name", required=false) @Size(max=15) @Pattern(regexp="[A-Za-z0-9]+") String name_requested){

		heroData = HeroData.getInstance();

		long id_passed = id_requested==null?-1:id_requested;
		String name_passed = name_requested==null?"missing":name_requested;

		return new HeroRequest(requestCounter.incrementAndGet(), heroData.getHero(id_passed, name_passed));
	}
}
