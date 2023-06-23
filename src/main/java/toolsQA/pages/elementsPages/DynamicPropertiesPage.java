package toolsQA.pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class DynamicPropertiesPage extends BasePage {

    private WebElement enableAfter;
    private WebElement colorChange;
    private WebElement visibleAfter;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getEnableAfter() {
        this.enableAfter = getDriver().findElement(By.id("enableAfter"));
        return enableAfter;
    }

    public WebElement getColorChange() {
        this.colorChange = getDriver().findElement(By.id("colorChange"));
        return colorChange;
    }

    public WebElement getVisibleAfter() {
        this.visibleAfter = getDriver().findElement(By.id("visibleAfter"));
        return visibleAfter;
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/dynamic-properties");
    }
}
