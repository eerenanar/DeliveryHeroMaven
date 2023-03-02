package stepdefinitions;

import java.io.IOException;
import java.time.Duration;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;
import static pages.BasePage.envURL;

public class Hooks {
	@Before
	public  void setUp() {
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.getDriver().get(envURL);
	}

	@After
	public  void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			//pages.BasePage.getScreenshot(scenario.getName());
		}
		//Driver.closeDriver();
		System.out.println("after");
	}
}
