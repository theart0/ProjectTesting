package stepdefinitions.admin;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;
public class insert_data_QLKH extends  BaseStepDef{
    TestContext testContext;

    public insert_data_QLKH(TestContext context){
        super(context);
        testContext = context;
    }


    @And("admin click button add course and enter name{string} and dicription{string} imgae {string}")
    public void adminClickButtonAddCategoryAndEnterNameAndDicriptionImgae(String name, String dicrip, String image) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Thêm khóa học')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        Helpers.delay(1);
        driver.findElement(By.xpath("//textarea[@id='inputDescription']")).sendKeys(dicrip);
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputimage']")).sendKeys(image);
        Helpers.delay(1);
        Select select = new Select(driver.findElement(By.name("status")));
        select.selectByVisibleText("Mở");
        Helpers.delay(1);
        select = new Select(driver.findElement(By.name("category_id")));
        select.selectByVisibleText("PHP");
        Helpers.delay(1);
        select = new Select(driver.findElement(By.name("user_id")));
        select.selectByVisibleText("admin");
        driver.findElement(By.xpath("//button[contains(text(),'Thêm Khóa học')]")).click();
    }

    @Then("admin insert data seccesfull KH")
    public void adminInsertDataSeccesfullKH() {
        String checktext = driver.findElement(By.xpath("//h1[contains(text(),'Danh sách các khóa học')]")).getText();
        Assert.assertEquals(checktext,"Danh sách các khóa học", "it's not QLKH page");
        String checkitem = driver.findElement(By.xpath("//span[@class='ml-4 text-success']")).getText();
        Assert.assertEquals(checkitem, "thêm thành công khóa học PHP !", "foul, plaese check");
    }
}

