package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import jdk.jfr.Enabled;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static homepage.HomePageWebElement.product;

public class HomePageTest extends WebAPI {

    HomePage homePage;
    //Regestration regestration

    @BeforeMethod
public void getInit(){

    //initElement provide the diver to the homepage.class or any class we want to test the action method
    // driver comes from the webApi
 homePage= PageFactory.initElements(driver,HomePage.class);
 //regestration= PageFactory.initElements(driver,Regestration.class); if we have multiple action  class

    //pageFactory is a class coming from java which has initElement method to help us provide the diver to the homepage.class
    // or any class we want to test the action method
}

//@Ignore
@Test(enabled = true)
    public void testSearchBox() throws InterruptedException {
    //getInit();
// call action method using reference variable homepage
  homePage.searchBox();

  String actualResults="\"metro pcs cell phones\"";
  String expectedResult=homePage.verifyText.getText();
    Assert.assertEquals(actualResults,expectedResult,"test fail");
}

@Test()
    public void testSearchBox1( ) throws InterruptedException {
    homePage.searchBox();

    String actualResults="\"metro pcs cell phones1\"";
    String expectedResult=homePage.verifyText.getText();
    Assert.assertEquals(actualResults,expectedResult,"test fail");

}
}
