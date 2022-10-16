package stepDefinations;

import io.cucumber.java.After;
import utils.ContextSetup;

public class Hooks {

	ContextSetup context;

	public Hooks(ContextSetup context) {
		this.context = context;
	}

	@After
	public void afterScenario() {
		context.testBase.webDriverManager().quit();
	}
}
