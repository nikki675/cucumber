package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defination {
	public static String van="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
WebDriver driver;
@Given("open the browser and navigate to the login page")
public void open_the_browser_and_navigate_to_the_login_page() {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get(van);
}
@Given("Enter the username {string}")
public void enter_the_username(String string) throws InterruptedException {
	Thread.sleep(4000);
	 driver.findElement(By.name("username")).sendKeys(string);
     
}
@And("Enter the password {string}")
public void enter_the_password(String string) throws InterruptedException {
	Thread.sleep(4000);
	 driver.findElement(By.name("password")).sendKeys(string);
}
@And("Click on the login button")
public void click_on_the_login_button() throws InterruptedException {
	Thread.sleep(4000);
	driver.findElement(By.xpath(" //*[@type= 'submit']" )).click();
}
@Then("I should see the username as {string}")
public void i_should_see_the_username_as(String string) {
    
}

}
