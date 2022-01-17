package stepdefinitions.admin;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;

public class insert_data_QLVD extends  BaseStepDef{
    TestContext testContext;

    public insert_data_QLVD(TestContext context){
        super(context);
        testContext = context;
    }


    @And("admin click button add video and enter name{string} and dicription{string} imgae {string} and video {string}")
    public void adminClickButtonAddVideoAndEnterNameAndDicriptionImgaeAndVideo(String name, String dicrip, String image, String video) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[normalize-space()='Video']")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Thêm')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        Helpers.delay(1);
        driver.findElement(By.xpath("//textarea[@id='inputdesc']")).sendKeys(dicrip);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputimage']")).sendKeys(image);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputvideo']")).sendKeys(video);
        driver.findElement(By.xpath("//button[normalize-space()='Thêm Video']")).click();
    }

    @Then("admin edit data seccesfull VD")
    public void adminInsertDataSeccesfullKH() {
        String checktext = driver.findElement(By.xpath("//h1[contains(text(),'Danh sách các Video của khóa học PHP')]")).getText();
        Assert.assertEquals(checktext,"Danh sách các Video của khóa học PHP", "it's not QLKH page");
        String checkitem = driver.findElement(By.xpath("//td[normalize-space()='PHP']")).getText();
        Assert.assertEquals(checkitem, "PHP", "foul, plaese check");
    }


}

