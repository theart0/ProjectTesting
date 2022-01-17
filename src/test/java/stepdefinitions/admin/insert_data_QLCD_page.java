package stepdefinitions.admin;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.testng.Assert;
import stepdefinitions.BaseStepDef;
import utils.helpers.Helpers;

public class insert_data_QLCD_page extends BaseStepDef {
    TestContext testContext;

    public insert_data_QLCD_page(TestContext context){
        super(context);
        testContext = context;
    }

    @And("admin click button add category and enter name{string} and dicription{string}")
    public void adminClickButtonAddCategoryAndEnterNameAndDicription(String name, String dicrip) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[contains(text(),'Thêm thể loại')]")).click();
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys(name);
        Helpers.delay(1);
        driver.findElement(By.xpath("//textarea[@id='inputDescription']")).sendKeys(dicrip);
        Helpers.delay(1);
        driver.findElement(By.xpath("//button[contains(text(),'Thêm chủ đề')]")).click();
    }
    @Then("admin insert data seccesfull Tl")
    public void adminInsertDataSeccesfullTl() {
        String checktext = driver.findElement(By.xpath("//h1[contains(text(),'Danh sách các thể loại')]")).getText();
        Assert.assertEquals(checktext,"Danh sách các thể loại", "it's not QLCD page");
        String checkitem = driver.findElement(By.xpath("//span[@class='ml-4 text-success']")).getText();
        Assert.assertEquals(checkitem, "thêm thành công thể loại PHP !", "foul, plaese check");



    }


}
