package toolsQA.pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class RadioButtonPage extends BasePage {

    private WebElement yesButton;
    private WebElement impressiveButton;
    private WebElement noButton;
    private WebElement selectionMessage;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesButton() {
        this.yesButton = getDriver().findElement(By.id("yesRadio"));
        return yesButton;
    }

    public WebElement getImpressiveButton() {
        this.impressiveButton = getDriver().findElement(By.id("impressiveRadio"));
        return impressiveButton;
    }

    public WebElement getNoButton() {
        this.noButton = getDriver().findElement(By.id("noRadio"));
        return noButton;
    }

    public WebElement getSelectionMessage() {
        this.selectionMessage = getDriver().findElement(By.xpath("//span[@class=\"text-success\"]"));
        return selectionMessage;
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/radio-button");
    }

    public void Click(WebElement element){
        Actions actions = new Actions(getDriver());
        actions.click(element).perform();
    }
}
