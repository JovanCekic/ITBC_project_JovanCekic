package toolsQA.pages.elementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class BrokenLinksPage extends BasePage {

    public BrokenLinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/broken");
    }
}
