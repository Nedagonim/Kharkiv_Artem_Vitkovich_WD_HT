package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public static final String SOMETHING = "Doom";

    @FindBy(xpath = "//input[@ class='gLFyf gsfi']")
    public WebElement search;

    @FindBy(xpath = "//div[@id='hdtb-msb']/div[1]/div/div[2]/a")
    public WebElement pictures;

    @FindBy(xpath = "//div/img[@class='rg_i Q4LuWd']")
    public WebElement picture;

    @FindBy(xpath = "//h1[@class='eYbsle mKq8g Da4KQe']")
    public WebElement result;


    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
