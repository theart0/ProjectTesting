package stepdefinitions;


import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.helpers.Helpers;

public class test_footer_homepage extends BaseStepDef {
    TestContext testContext;

    public test_footer_homepage(TestContext context) {
        super(context);
        testContext = context;
    }

    @When("click on Trang chu button at footer")
    public void clickOnTrangChuButtonAtFooter() {
        driver.findElement(By.xpath("//a[normalize-space()='']")).click();
        Helpers.delay(1);
    }

    @Then("homepage appear")
    public void homepageAppear() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"home","Foul, please check!!");
    }
}
