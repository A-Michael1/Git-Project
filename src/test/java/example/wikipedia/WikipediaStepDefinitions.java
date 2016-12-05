package example.wikipedia;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class WikipediaStepDefinitions {

	private WikipediaHomePage wikipediaHomePage;

	@Given("^the Wikipedia site is accessed$")
	public void the_Wikipedia_site_is_accessed()
	{
		wikipediaHomePage.open();
	}

	@When("^searching for '(.*)'$")
	public void searching_for(String a)
	{
		wikipediaHomePage.Search(a);
	}

	//@Then("^the returned page contains the '(.*)'$")
	//public void the_returned_page_contains_the_header(String term)

}


