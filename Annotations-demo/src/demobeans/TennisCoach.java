package demobeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	FortuneService fortuneService;
	
	
	
	public TennisCoach() {
		System.out.println("wassup");
	}

	@Autowired
	@Qualifier("databaseFortuneService")
	public void setTennisCoach(FortuneService fortuneService) {
		System.out.println("inside setter");
		this.fortuneService = fortuneService;
	}

	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("Initializer");
	}
	
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println("Destroyer");
	}
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice ace serves" ;
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
