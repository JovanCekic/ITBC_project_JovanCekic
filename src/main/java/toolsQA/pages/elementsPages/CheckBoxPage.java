package toolsQA.pages.elementsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import toolsQA.pages.BasePage;

public class CheckBoxPage extends BasePage {

    private WebElement homeExpand;
    private WebElement desktopExpand;
    private WebElement documentsExpand;
    private WebElement workSpaceExpand;
    private WebElement officeExpand;
    private WebElement downloadsExpand;
    private WebElement homeCheckBox;
    private WebElement desktopCheckBox;
    private WebElement notesCheckBox;
    private WebElement commandsCheckBox;
    private WebElement documentsCheckBox;
    private WebElement workSpaceCheckBox;
    private WebElement reactCheckBox;
    private WebElement angularCheckBox;
    private WebElement veuCheckBox;
    private WebElement officeCheckBox;
    private WebElement publicCheckBox;
    private WebElement privateCheckBox;
    private WebElement classifiedCheckBox;
    private WebElement generalCheckBox;
    private WebElement downloadsCheckBox;
    private WebElement wordFileCheckBox;
    private WebElement excelFileCheckBox;

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHomeExpand() {
        this.homeExpand = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > span > button"));
        return homeExpand;
    }

    public WebElement getDesktopExpand() {
        this.desktopExpand = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > button"));
        return desktopExpand;
    }

    public WebElement getDocumentsExpand() {
        this.documentsExpand = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > button"));
        return documentsExpand;
    }

    public WebElement getWorkSpaceExpand() {
        this.workSpaceExpand = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > button"));
        return workSpaceExpand;
    }

    public WebElement getOfficeExpand() {
        this.officeExpand = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li.rct-node.rct-node-parent.rct-node-collapsed > span > button > svg"));
        return officeExpand;
    }

    public WebElement getDownloadsExpand() {
        this.downloadsExpand = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-collapsed > span > button > svg"));
        return downloadsExpand;
    }

    public WebElement getHomeCheckBox() {
        this.homeCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
        return homeCheckBox;
    }

    public WebElement getDesktopCheckBox() {
        this.desktopCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        return desktopCheckBox;
    }

    public WebElement getNotesCheckBox() {
        this.notesCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        return notesCheckBox;
    }

    public WebElement getCommandsCheckBox() {
        this.commandsCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
        return commandsCheckBox;
    }

    public WebElement getDocumentsCheckBox() {
        this.documentsCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
        return documentsCheckBox;
    }

    public WebElement getWorkSpaceCheckBox() {
        this.workSpaceCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        return workSpaceCheckBox;
    }

    public WebElement getReactCheckBox() {
        this.reactCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        return reactCheckBox;
    }

    public WebElement getAngularCheckBox() {
        this.angularCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
        return angularCheckBox;
    }

    public WebElement getVeuCheckBox() {
        this.veuCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg"));
        return veuCheckBox;
    }

    public WebElement getOfficeCheckBox() {
        this.officeCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
        return officeCheckBox;
    }

    public WebElement getPublicCheckBox() {
        this.publicCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        return publicCheckBox;
    }

    public WebElement getPrivateCheckBox() {
        this.privateCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
        return privateCheckBox;
    }

    public WebElement getClassifiedCheckBox() {
        this.classifiedCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg"));
        return classifiedCheckBox;
    }

    public WebElement getGeneralCheckBox() {
        this.generalCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(4) > span > label > span.rct-checkbox > svg"));
        return generalCheckBox;
    }

    public WebElement getDownloadsCheckBox() {
        this.downloadsCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg"));
        return downloadsCheckBox;
    }

    public WebElement getWordFileCheckBox() {
        this.wordFileCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
        return wordFileCheckBox;
    }

    public WebElement getExcelFileCheckBox() {
        this.excelFileCheckBox = getDriver().findElement(
                By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
        return excelFileCheckBox;
    }

    public void open(){
        getDriver().navigate().to("https://demoqa.com/checkbox");
    }

    public void expand(){
        getHomeExpand().click();
        getDesktopExpand().click();
        getDocumentsExpand().click();
        getWorkSpaceExpand().click();
        getOfficeExpand().click();
        getDownloadsExpand().click();
    }
}
