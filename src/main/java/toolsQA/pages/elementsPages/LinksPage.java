package toolsQA.pages.elementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class LinksPage extends BasePage {

    public LinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/links");
    }
}
