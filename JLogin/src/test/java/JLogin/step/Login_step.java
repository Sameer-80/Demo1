package JLogin.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login_step 
{

	@Given("^user have access google url$")
	public void user_have_access_google_url() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("access gogle"); 
	}

	
	@When("^user search \"([^\"]*)\" in search$")
	public void user_search_in_search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(arg1); 
	}

}
