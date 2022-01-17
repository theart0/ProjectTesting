package stepdefinitions;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import utils.helpers.Helpers;



public class watch_course  extends  BaseStepDef{
    TestContext testContext;

    public watch_course(TestContext context){
        super(context);
        testContext = context;
    }
    @Then("user navigator to Course page")
    public void userNavigatorToCoursePage() {
        String tag = driver.findElement(By.xpath("//p[contains(text(),'Bài Giảng')]")).getText();
        Assert.assertEquals(tag,"Trang Chủ >> Bài Giảng","Foul, please check!!");

    }
}
