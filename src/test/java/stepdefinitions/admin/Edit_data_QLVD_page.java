package stepdefinitions.admin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.TestContext;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;
public class Edit_data_QLVD_page extends BaseStepDef {
    TestContext testContext;
    public Edit_data_QLVD_page(TestContext context){
        super(context);
        testContext = context;
    }
    

    @And("admin click edit on the QLVD page")
    public void adminClickEditOnTheQLVDPage() {
        driver.findElement(By.xpath("//a[contains(text(),'Sửa')]")).click();
    }

    @And("enter new name{string} and newdicription {string} and newimgae {string} and video{string} and click button edit")
    public void enterNewNameAndNewdicriptionAndNewimgaeAndVideoAndClickButtonEdit(String name, String dicrip, String image, String video) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).clear();
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@id='inputdesc']")).clear();
        driver.findElement(By.xpath("//textarea[@id='inputdesc']")).sendKeys(dicrip);
        driver.findElement(By.xpath("//input[@id='inputimage']")).clear();
        driver.findElement(By.xpath("//input[@id='inputimage']")).sendKeys(image);
        driver.findElement(By.xpath("//input[@id='inputvideo']")).clear();
        driver.findElement(By.xpath("//input[@id='inputvideo']")).sendKeys(video);
        Helpers.delay(1);
        driver.findElement(By.xpath("//button[contains(text(),'Cập nhật Video')]")).click();
    }

    @Then("data of video edit secessfull")
    public void dataOfVideoEditSecessfull() {
        String checkitem1 = driver.findElement(By.xpath("//td[normalize-space()='php']")).getText();
        String checkitem2 = driver.findElement(By.xpath("//td[contains(text(),'học PHP không dễ')]")).getText();
        Assert.assertEquals(checkitem1, "php", "foul, please check");
        Assert.assertEquals(checkitem2, "học PHP không dễ", "foul, please check");
    }
}
