package stepdefinitions;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import utils.helpers.Helpers;

public class watch_video extends BaseStepDef{
    TestContext testContext;

    public watch_video(TestContext context){
        super(context);
        testContext = context;
    }
    @And("click on play video button")
    public void clickOnPlayVideoButton() {
        driver.findElement(By.xpath("//div[@class='video']//video")).click();
        }

    @Then("video player window appear")
    public void videoPlayerWindowAppear() {
        boolean video = driver.findElement(By.xpath("//div[@class='modal-body']//video")).isDisplayed();
        Assert.assertTrue(true,"Foul please check!!");
    }
}
