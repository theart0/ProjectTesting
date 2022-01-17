package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class test_footer_facebook  extends  BaseStepDef{
    TestContext testContext;

    public test_footer_facebook(TestContext context){
        super(context);
        testContext = context;
    }
    @When("click on facebook button")
    public void clickOnFacebookButton() {
        driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
        }

    @Then("facebook window appear")
    public void facebookWindowAppear() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Facebook","Foul please check!!!");
    }
}
