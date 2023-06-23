package toolsQA.pages.elementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class UpAndDownloadPage extends BasePage {

    public UpAndDownloadPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void open(){
        getDriver().navigate().to("https://demoqa.com/upload-download");
    }
}
