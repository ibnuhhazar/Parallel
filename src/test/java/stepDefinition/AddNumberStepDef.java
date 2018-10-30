package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class AddNumberStepDef 
{	
	int sum;
	
	@Before public void setUP() {
		System.out.println(" Ini Setup Awal ");
	}
	
	@Then("^User add this two number$")
	public void user_add_this_two_number() throws Throwable 
	{
		sum = 10+20;
		
		Thread.sleep(10000);
	}
	
	@Then("^User add this three number$")
	public void user_add_this_three_number() throws Throwable 
	{
		sum =10+20+30;
	}
	
	@Then("^Print the sum$")
	public void print_the_sum() throws Throwable 
	{
		System.err.println("Sum is  :"+sum);
	}
	
	@After public void Akhiran() {
		System.out.println(" Akhiran ");
	}
}
