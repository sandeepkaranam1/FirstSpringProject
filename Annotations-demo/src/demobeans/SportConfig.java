package demobeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("demobeans")
public class SportConfig {

	@Bean 
	public FortuneService happyFortuneService()
	{
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach tennisCoach()
	{
		return new TennisCoach(happyFortuneService());
	}
}
