package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {



    // find by annotation coming from selenium
    // the Locator Variable needs to be final / the attribute value needs to be constant
  // first approach
    @FindBy(how= How.ID, using = wedEditLocator)public WebElement searchBox;

    //second approach using private
    @FindBy(how = How.ID, using = webButtonLocator)public WebElement searchButton;


    public  void searchBox() throws InterruptedException {
        searchBox.sendKeys(product);

        Thread.sleep(4000);

        searchButton.click();
    }

    //third approach


//    //@FindBy(id=webButtonLocator)public WebElement searchButton1;
//    public WebElement getSearchButton() {
//        return searchButton;
//    }
//
//    public void setSearchButton(WebElement searchButton) {
//        this.searchButton = searchButton;
//    }




}