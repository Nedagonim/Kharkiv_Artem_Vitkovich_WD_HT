package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.testng.Assert.assertTrue;

public class BaseSteps {
    WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;


    @Before
    public void testSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("User is on home page")
    public void homePage() {
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        homePage.openHomePage();
    }


    @When("User can use search")
    public void search() {
        searchPage.search.sendKeys(SearchPage.SOMETHING, Keys.ENTER);
        searchPage.pictures.click();
        searchPage.picture.click();
        assertTrue(searchPage.result.getText().contains(SearchPage.SOMETHING));
    }



    @After
    public void tearDown() {
        driver.close();
    }
}