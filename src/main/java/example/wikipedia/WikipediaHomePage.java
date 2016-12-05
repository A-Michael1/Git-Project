package example.wikipedia;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;


@DefaultUrl("http://www.wikipedia.com")
public class WikipediaHomePage extends PageObject{

	public String GO_BUTTON = "#pure-button";
	public String SEARCH_INPUT_TEXT = "#searchInput";

	public void Search(String a)
	{
		$(SEARCH_INPUT_TEXT).type(a).then().sendKeys(Keys.ENTER);
	}

}
