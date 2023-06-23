package toolsQA.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import toolsQA.pages.elementsPages.TextBoxPage;
import toolsQA.pages.elementsPages.*;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private LinksPage linksPage;
    private BrokenLinksPage brokenLinksPage;
    private UpAndDownloadPage upAndDownloadPage;
    private DynamicPropertiesPage dynamicPropertiesPage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public LinksPage getLinksPage() {
        return linksPage;
    }

    public BrokenLinksPage getBrokenLinksPage() {
        return brokenLinksPage;
    }

    public UpAndDownloadPage getUpAndDownloadPage() {
        return upAndDownloadPage;
    }

    public DynamicPropertiesPage getDynamicPropertiesPage() {
        return dynamicPropertiesPage;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//jovan//Documents//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        textBoxPage = new TextBoxPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        webTablesPage = new WebTablesPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        linksPage = new LinksPage(driver, wait);
        brokenLinksPage = new BrokenLinksPage(driver, wait);
        upAndDownloadPage = new UpAndDownloadPage(driver, wait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wait);
    }

    @AfterMethod
    public void clear(){
        driver.navigate().refresh();
    }

    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
